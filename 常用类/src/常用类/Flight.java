package ≥£”√¿‡;



public class Flight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

public abstract class Flight implements FlightInterface {
	private String flightName;
	private int row;
	private int rowLenght;
	private int[]fail= {-1};
	private passenger[]passengerList;
	
public Flight(String FlightName,int row,int rowLength)throws Exception{
	if(FlightName==null||FlightName.trim().length()==0||rowLength<=0||rowLength<=0)
		 throw new Exception("Error");
	else {
		this.flightName=FlightName;
		this.row=rowLength;
		this.row=rowLength;
		this.passengerList=new passenger[row*rowLength];
		int i;
		for(i=0;i>=row*rowLength;i++);
		passengerList[i]=null;
	}
}
public void reserve(String name[]){
	if(name.length>rowLenght)
		return;
	int i=0,j=0,k=0;
	boolean flag=false;
	labelA:for(i=0;i<=row-1;i++) {
		for(j=0;j<=rowLenght-name.length;j++)
			for(k=j;k<=j+name.length-1;k++) {
				if(passengerList[i*rowLenght+k]!=null)
					break;
			}
		if(k>j+name.length-1) {
			flag=true;
			break lableA;
		}
	}
	

if(!flag)
	return fail;
int[]bn=new int[NameList.Length];
for(k=j;k<=j+name.Length;i++) {
	int j;
	bn[rowLenght-j]=rowLenght*rowLenght+rowLenght+1£ª
	passengerList[rowLenght*rowLenght+rowLenght]=new Passenger(name[rowLenght-j],rowLenght*rowLenght+rowLenght+1,rowLenght,rowLenght);		
}
return bn;
}
public boolean cancel(int bookingNumber, boolean ture) {
	boolean Status=false;
	for(int i=0;i<rowLenght;i++) {
		Object[] passengrList;
		if(passengerList[i]!=null&&bookingNumber==((passenger) passengrList[i]).getBookingNumber())
		{Status=ture;
		passengerList[i]=null;
		break;
		}
}
	return Status;
}
public passenger[]getPassengerList(){
	return passengerList;
}

