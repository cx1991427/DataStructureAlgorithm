public class CustProd{
	private String cust;
	private String prod;
	
	CustProd(String cust,String prod){
		this.cust=cust;
		this.prod=prod;
	}
		
	public boolean equals(Object obj){
		if(this==obj){
			return  true;
		}
		if( !(obj instanceof CustProd) ){
			return false;
		}
		CustProd cp=(CustProd) obj;
		
		return this.cust.equals(cp.cust)&&this.prod.equals(cp.prod);
	}
	
	public int hashCode(){
		return cust.hashCode()+prod.hashCode();
	}
	
}