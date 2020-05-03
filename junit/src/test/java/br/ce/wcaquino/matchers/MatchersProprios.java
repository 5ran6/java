package br.ce.wcaquino.matchers;

import java.util.Calendar;

public class MatchersProprios {
	
	public static DiaSemanaMatcher caiEm(Integer diaSemana) {
		return new DiaSemanaMatcher(diaSemana);
	}

	public static DiaSemanaMatcher caiNumaSegunda() {
		return new DiaSemanaMatcher(Calendar.MONDAY);
	}
	
	public static DataDiferencaDiasMatchers ehHojeComDiferencaDias(Integer dias) {
		return new DataDiferencaDiasMatchers(dias);
	}
	
	public static DataDiferencaDiasMatchers ehHoje() {
		return new DataDiferencaDiasMatchers(0);
	}
}
