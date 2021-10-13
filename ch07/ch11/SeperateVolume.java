package ch11;

public class SeperateVolume implements Lendable{
	static final String itemNo="111";
	static int seq=0;
	
	private String requestNo; 
	private String title; 
	private String writer;
	private int state; 
	private String name=""; 
	private String date="";
	{	  
	seq++;
	DecimalFormat df = new DecimalFormat("000");
	requsetNo = itemNo+"-"df.format(seq);
	} 
	public SeperateVolume(String requestNo, String title, String writer) {
		this.requestNo = requestNo;
		this.title = title;
		this.writer = writer;
	}

		@Override
		public void checkOut(String name, String date) {
	     if(state==BORROWED) {
	    	 System.out.println(title+"는 이미대출중입니다");
	    	 return;}
	     //
	     this.name=name;
	     this.date=date;
	     state=BORROWED;//대출상태 변경(정상->대출
	     System.out.println(title+"을 "+name+"가 대출했습니다.");
	     System.out.println("대출일자: "+date);
		}

		@Override
		public void checkIn() {
	     name="";
	     date="";
	     state=NORMAL;
	     System.out.println(title+"을 반납했습니다.");
		}	
		
}
