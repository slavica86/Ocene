package niz;

public class Ocene {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ocene = {5,5,3,4,5,3,2,5,5,5,5};
		int[] brOcena = new int[5];
		
		for(int i = 0; i < brOcena.length; i++)
		{
			brOcena[i] = 0;
		}
		double uspeh = 0;
		for(int i = 0; i < ocene.length; i++)
		{
			uspeh += ocene[i];
			
			switch(ocene[i])
			{
			case 1: brOcena[0]++;
			break;
			case 2: brOcena[1]++;
			break;
			case 3: brOcena[2]++;
			break;
			case 4: brOcena[3]++;
			break;
			case 5: brOcena[4]++;
			break;
			}
		}
		if(brOcena[0] != 0)
		{
			System.out.println("Nedovoljan");
			System.out.println("Nedovoljnih ocena:"+brOcena[0]);
		}
		else
		{
			System.out.println("Odlicnih ocena:"+brOcena[4]);
			System.out.println("Vrlodobrih ocena:"+brOcena[3]);
			System.out.println("Dobrih ocena:"+brOcena[2]);
			System.out.println("Dovoljnih ocena:"+brOcena[1]);
			uspeh /= ocene.length;
			System.out.println("Uspeh:"+uspeh);
		}
		}
		

	}


