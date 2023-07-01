package basic;

public enum EnumEx {
	winter(0),summer(1),monsoon(2);
	private int index;
     private EnumEx(int index) {
    	 this.index=index;
     }
    public static void main(String[] args) {
		System.out.println(EnumEx.summer.index);
	}
}
