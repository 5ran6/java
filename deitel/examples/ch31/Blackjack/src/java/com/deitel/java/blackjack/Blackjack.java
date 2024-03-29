// Fig. 28.13: Blackjack.java
// Blackjack web service that deals cards and evaluates hands
package com.deitel.java.blackjack;

import java.util.ArrayList;
import java.util.Random;
import javax.annotation.Resource;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceContext;
import javax.xml.ws.handler.MessageContext;

@WebService( name = "Blackjack", serviceName = "BlackjackService" )
public class Blackjack
{
   // use @Resource to create a WebServiceContext for session tracking
   private @Resource WebServiceContext webServiceContext;
   private MessageContext messageContext; // used in session tracking
   private HttpSession session; // stores attributes of the session

   // deal one card
   @WebMethod( operationName = "dealCard" )
   public String dealCard()
   {
      String card = "";

      ArrayList< String > deck =
         ( ArrayList< String > ) session.getAttribute( "deck" );

      card = deck.get( 0 ); // get top card of deck
      deck.remove( 0 ); // remove top card of deck

      return card;
   } // end WebMethod dealCard

   // shuffle the deck
   @WebMethod( operationName = "shuffle" )
   public void shuffle()
   {
      // obtain the HttpSession object to store deck for current client
      messageContext = webServiceContext.getMessageContext();
      session = ( ( HttpServletRequest ) messageContext.get(
         MessageContext.SERVLET_REQUEST ) ).getSession();

      // populate deck of cards
      ArrayList< String > deck = new ArrayList< String >();

      for ( int face = 1; face <= 13; face++ ) // loop through faces
         for ( int suit = 0; suit <= 3; suit++ ) // loop through suits
            deck.add( face + " " + suit ); // add each card to deck

      String tempCard; // holds card temporarily durring swapping
      Random randomObject = new Random(); // generates random numbers
      int index; // index of randomly selected card

      for ( int i = 0; i < deck.size() ; i++ ) // shuffle
      {
         index = randomObject.nextInt( deck.size() - 1 );

         // swap card at position i with randomly selected card
         tempCard = deck.get( i );
         deck.set( i, deck.get( index ) );
         deck.set( index, tempCard );
      } // end for

      // add this deck to user's session
      session.setAttribute( "deck", deck );
   } // end WebMethod shuffle

   // determine a hand's value
   @WebMethod( operationName = "getHandValue" )
   public int getHandValue( @WebParam( name = "hand" ) String hand )
   {
      // split hand into cards
      String[] cards = hand.split( "\t" );
      int total = 0; // total value of cards in hand
      int face; // face of current card
      int aceCount = 0; // number of aces in hand

      for ( int i = 0; i < cards.length; i++ )
      {
         // parse string and get first int in String
         face = Integer.parseInt(
            cards[ i ].substring( 0, cards[ i ].indexOf( " " ) ) );

         switch ( face )
         {
            case 1: // in ace, increment aceCount
               ++aceCount;
               break;
            case 11: // jack
            case 12: // queen
            case 13: // king
               total += 10;
               break;
            default: // otherwise, add face
               total += face;
               break;
         } // end switch
      } // end for

      // calculate optimal use of aces
      if ( aceCount > 0 )
      {
         // if possible, count one ace as 11
         if ( total + 11 + aceCount - 1 <= 21 )
            total += 11 + aceCount - 1;
         else // otherwise, count all aces as 1
            total += aceCount;
       } // end if

      return total;
   } // end WebMethod getHandValue
} // end class Blackjack


/**************************************************************************
 * (C) Copyright 1992-2009 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/


