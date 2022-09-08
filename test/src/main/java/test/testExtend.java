package test;


public class testExtend {

	class first {

		String getFirst() {
			return "First";
		}
	}

	class second extends first {

		String getSecond() {
			return "Second";
		}
	}

	 class third extends second {

		String getThird() {
			String test = super.getFirst();

			return test;
		}
	}
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		testExtend th = new testExtend();
//		String name = th.getClass().getCanonicalName();
		
	}

}