val VALID_GRADES = Set("A", "B", "C", "D", "F")

def letterGrade(value: Any) : String = value match {
	case x:Int if (90 to 100).contains(x) => "A"
	case x:Int if (80 to 90).contains(x) => "B"
	case x:Int if (70 to 80).contains(x) => "C"
	case x:Int if (60 to 70).contains(x) => "D"
	case x:Int if (0 to 60).contains(x) => "F"
	case x:String if VALID_GRADES(x.toUpperCase) => x.toUpperCase
}

printf("Amy scores %d and receives %s\n", 91, letterGrade(91))
printf("Amy scores %d and receives %s\n", 70, letterGrade(70))
printf("Roy transfered and already had %s, which translated as %s\n", "b", letterGrade("b"))
