package com.javaex.ex03;

public class Ex05 {

	public static void main(String[] args) {
		String ch="*";
		int i=1;
			for(int j=0;j<6;j++) {
				if(i>j)
					System.out.println(ch);
				else
					{ch=ch+"*";
					System.out.println(ch);
					}					
			}							
		}
		/*int i=1;
		while(true) {
			if((i%6==0)&&(i%14==0))
				{System.out.println(i);
			break;}
		else
			{i++;
			continue;
			}
			
		}*/
	}


