
public class TassaTest {

	
	
	double importo;
	
	 
	
	public TassaTest(double newImporto) {
		
		importo=newImporto;
		
	}
	
	public double getTassa() {
		double tassa=0;
		
		int    tassa10=1000;
		int     tassa7=700;
		int     tassa5=500;
		double     a=0;
		
		if(importo<=10000) 
			
			tassa=((importo*10)/100);
		
		if (importo>10000 && importo <=20000) {
			a=importo-10000;
			tassa=((a*7)/100)+tassa10;
		}
		if (importo>20000 && importo <=30000) {
			a=importo-20000;
			tassa=((a*5)/100)+tassa10+tassa7;
		}
		if (importo>30000) {
			a=importo-30000;
			tassa=((a*3)/100)+tassa10+tassa7+tassa5;
			}	
				
		return tassa;
	}
	
}
