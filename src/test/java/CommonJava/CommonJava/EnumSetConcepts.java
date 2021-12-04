package CommonJava.CommonJava;

import java.util.EnumSet;

public class EnumSetConcepts {
	
	enum Lang{JAVA,JAVASCRIPT,PYTHON,RUBY,GO}

	public static void main(String[] args) {
		
		//Create EnumSet using an Enum
		EnumSet<Lang> langs = EnumSet.allOf(Lang.class);
		System.out.println(langs);
		
		//Create EnumSet with a range of Enum
		EnumSet<Lang> rangeEnumSet = EnumSet.range(Lang.JAVA, Lang.RUBY);
		System.out.println(rangeEnumSet);
		
		//of
		EnumSet<Lang> specificEnumSet = EnumSet.of(Lang.JAVA,Lang.PYTHON);
		System.out.println(specificEnumSet);
		
		//Create blank EnumSet- noneOf
		EnumSet<Lang> blankEnumSet = EnumSet.noneOf(Lang.class);
		System.out.println(blankEnumSet);
		
		
		

	}
}
