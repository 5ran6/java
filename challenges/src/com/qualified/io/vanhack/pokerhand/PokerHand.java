package com.qualified.io.vanhack.pokerhand;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;

/**
 *
 * brunolima on Apr 30, 2021
 * 
 */

public class PokerHand {

	private List<Card> cards;
	private Map<Integer, List<Card>> cardsMap;

	PokerHand(String hand) {
		this.cards = new ArrayList<>();

		String[] cardS = hand.split(" ");

		for (String card : cardS) {
			this.cards.add(new Card(card));
		}

		this.cards.sort(Comparator.comparingInt(o -> o.value));
		this.cardsMap = Helpers.getValueMap(this.cards);
	}

	Result compareWith(PokerHand hand) {
		Ranks current = rank();
		Ranks other = hand.rank();

		if (current.getRank() > other.getRank()) {
			return Result.WIN;
		} else if (current.getRank() < other.getRank()) {
			return Result.LOSS;
		} else {
			return current.resolveConflict(this, hand);
		}
	}

	Ranks rank() {
		if (isStraightFlush()) {
			return Ranks.STRAIGHT_FLUSH;
		} else if (isFourOfAKind()) {
			return Ranks.FOUR_OF_A_KIND;
		} else if (isFullHouse()) {
			return Ranks.FULL_HOUSE;
		} else if (isFlush()) {
			return Ranks.FLUSH;
		} else if (isStraight()) {
			return Ranks.STRAIGHT;
		} else if (isThreeOfAKind()) {
			return Ranks.THREE_OF_A_KIND;
		} else if (isTwoPair()) {
			return Ranks.TWO_PAIR;
		} else if (isOnePair()) {
			return Ranks.ONE_PAIR;
		} else {
			return Ranks.HIGH_CARD;
		}
	}

	private boolean isOnePair() {
		return Helpers.getCountOfGroupOfASize(this.cardsMap, 2) == 1;
	}

	private boolean isTwoPair() {
		return Helpers.getCountOfGroupOfASize(this.cardsMap, 2) == 2;
	}

	private boolean isThreeOfAKind() {
		return Helpers.getCountOfGroupOfASize(this.cardsMap, 3) == 1;
	}

	private boolean isFullHouse() {
		return isThreeOfAKind() && isOnePair();
	}

	private boolean isFourOfAKind() {
		return Helpers.getCountOfGroupOfASize(this.cardsMap, 4) == 1;
	}

	private boolean isStraightFlush() {
		return isStraight() && isFlush();
	}

	private boolean isStraight() {
		boolean isIncreasing = true;
		
		for (int i = 0; i < this.cards.size() - 1; i++) {
			
			if (Math.abs(this.cards.get(i).getValue() - this.cards.get(i + 1).getValue()) != 1) {
				isIncreasing = false;
			}
		}
		
		return isIncreasing;
	}

	private boolean isFlush() {
		return this.cards.stream().collect(groupingBy(PokerHand.Card::getSuit)).size() == 1;
	}

	public enum Result {
		TIE, WIN, LOSS
	}

	public enum Ranks {
		HIGH_CARD {
			@Override
			public int getRank() {
				return 1;
			}

			@Override
			public PokerHand.Result resolveConflict(PokerHand first, PokerHand second) {
				return Helpers.getHighCardResults(first.cards, second.cards);
			}
		},
		ONE_PAIR {
			@Override
			public int getRank() {
				return 2;
			}

			@Override
			public PokerHand.Result resolveConflict(PokerHand first, PokerHand second) {
				List<PokerHand.Card> firstCards = new ArrayList<>();
				List<PokerHand.Card> secondCards = new ArrayList<>();

				int firstPairValue = getHandDetails(first, firstCards);

				int secondPairValue = getHandDetails(second, secondCards);

				if (firstPairValue > secondPairValue) {
					return PokerHand.Result.WIN;
				} else if (firstPairValue < secondPairValue) {
					return PokerHand.Result.LOSS;
				} else {
					return Helpers.getHighCardResults(firstCards, secondCards);
				}
			}

			private int getHandDetails(PokerHand hand, List<PokerHand.Card> cards) {
				int value = 0;

				for (Map.Entry<Integer, List<PokerHand.Card>> entry : hand.cardsMap.entrySet()) {
					if (entry.getValue().size() == 1) {
						cards.addAll(entry.getValue());
					} else {
						value = entry.getKey();
					}
				}
				
				return value;
			}
		},
		TWO_PAIR {
			@Override
			public int getRank() {
				return 3;
			}

			@Override
			public PokerHand.Result resolveConflict(PokerHand first, PokerHand second) {
				List<Integer> firstValues = new ArrayList<>(first.cardsMap.keySet());
				firstValues.sort(Comparator.reverseOrder());
				
				List<Integer> secondValues = new ArrayList<>(second.cardsMap.keySet());
				secondValues.sort(Comparator.reverseOrder());
				
				return Helpers.getHighCardResultsForValues(firstValues, secondValues);
			}
		},
		THREE_OF_A_KIND {
			@Override
			public int getRank() {
				return 4;
			}

			@Override
			public PokerHand.Result resolveConflict(PokerHand first, PokerHand second) {
				return Helpers.getHighCardResults(first.cards, second.cards);
			}
		},
		STRAIGHT {
			@Override
			public int getRank() {
				return 5;
			}

			@Override
			public PokerHand.Result resolveConflict(PokerHand first, PokerHand second) {
				return Helpers.getHighCardResults(first.cards, second.cards);
			}
		},
		FLUSH {
			@Override
			public int getRank() {
				return 6;
			}

			@Override
			public PokerHand.Result resolveConflict(PokerHand first, PokerHand second) {
				return Helpers.getHighCardResults(first.cards, second.cards);
			}
		},
		FULL_HOUSE {
			@Override
			public int getRank() {
				return 7;
			}

			@Override
			public PokerHand.Result resolveConflict(PokerHand first, PokerHand second) {
				return Helpers.getHighCardResults(first.cards, second.cards);
			}
		},
		FOUR_OF_A_KIND {
			@Override
			public int getRank() {
				return 8;
			}

			@Override
			public PokerHand.Result resolveConflict(PokerHand first, PokerHand second) {
				return Helpers.getHighCardResults(first.cards, second.cards);
			}
		},
		STRAIGHT_FLUSH {
			@Override
			public int getRank() {
				return 9;
			}

			@Override
			public PokerHand.Result resolveConflict(PokerHand first, PokerHand second) {
				return Helpers.getHighCardResults(first.cards, second.cards);
			}
		};

		public abstract int getRank();

		public abstract PokerHand.Result resolveConflict(PokerHand first, PokerHand second);
	}

	static class Helpers {

		static PokerHand.Result getHighCardResults(List<PokerHand.Card> firstCardList, List<PokerHand.Card> secondCardList) {
			int i = firstCardList.size() - 1;
			
			while (i >= 0) {
				if (firstCardList.get(i).getValue() > secondCardList.get(i).getValue()) {
					return PokerHand.Result.WIN;
				} else if (firstCardList.get(i).getValue() < secondCardList.get(i).getValue()) {
					return PokerHand.Result.LOSS;
				}
				
				i--;
			}
			return PokerHand.Result.TIE;
		}

		static PokerHand.Result getHighCardResultsForValues(List<Integer> firstCardList, List<Integer> secondCardList) {
			int i = firstCardList.size() - 1;
			
			while (i >= 0) {
				if (firstCardList.get(i) > secondCardList.get(i)) {
					return PokerHand.Result.WIN;
				} else if (firstCardList.get(i) < secondCardList.get(i)) {
					return PokerHand.Result.LOSS;
				}
				
				i--;
			}
			return PokerHand.Result.TIE;
		}

		static Map<Integer, List<PokerHand.Card>> getValueMap(List<PokerHand.Card> cards) {
			return cards.stream().collect(groupingBy(PokerHand.Card::getValue));
		}

		static int getCountOfGroupOfASize(Map<Integer, List<PokerHand.Card>> map, int groupSize) {
			return (int) map.entrySet().stream().filter(x -> x.getValue().size() == groupSize).count();
		}

	}

	public class Card {
		private int value;
		private char suit;

		Card(String representation) {
			this.value = calculateValue(representation.charAt(0));
			this.suit = representation.charAt(1);
		}

		int getValue() {
			return this.value;
		}

		char getSuit() {
			return this.suit;
		}

		private int calculateValue(char first) {
			int cardValue;
			switch (first) {
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				cardValue = Integer.parseInt(first + "");
				break;
			case 'T':
				cardValue = 10;
				break;
			case 'J':
				cardValue = 11;
				break;
			case 'Q':
				cardValue = 12;
				break;
			case 'K':
				cardValue = 13;
				break;
			case 'A':
				cardValue = 14;
				break;
			default:
				throw new IllegalArgumentException("Invalid card");
			}
			return cardValue;
		}
	}

}
