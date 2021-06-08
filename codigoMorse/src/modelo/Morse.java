package modelo;

import java.util.Scanner;

public class Morse {
	public static void main(String[] args) {

		Scanner lector=new Scanner(System.in);
		String texto="";
		int tam=0;

		do{
			System.out.println("--------------------  Clave Morse a Texto o Viceversa  --------------------\nIngrese el texto que desea convertir");
			texto=lector.nextLine();
			tam=texto.length();
			if (tam==0 || texto.charAt(0)==' ') {
				System.out.println("Favor de ingresar texto");
			}
		}while (tam==0 || texto.charAt(0)==' ');

		if (texto.charAt(0)!='.' && texto.charAt(0)!='-') {
			System.out.println("---------- Su conversion es: TEXTO a CLAVE MORSE ----------\nEL TEXTO ES: "+texto.toUpperCase());
			String cveMorse="";
			char letra='A';
			int cont=0,contAbe=0,tipo;
			texto=texto.toUpperCase();
			for (int i = 0; i < tam; i++) {
				tipo=getTipo(texto.charAt(i));
				switch (tipo) {
				case 1:
					cveMorse+=getLetra(texto.charAt(i));
					break;
				case 2:
					cveMorse+=getNumero(texto.charAt(i));
					break;
				default:
					cveMorse+="   ";
					break;
				}
			}
			System.out.println("LA CLAVE MORSE SERÍA: "+cveMorse);
		} else {
			System.out.println("---------- Su conversion es de CLAVE MORSE a TEXTO ----------\nEl TEXTO MORSE ES: "+texto.toUpperCase());
			String textoT="",cadena="",aux="";
			int bandera=0;
			int tipo=0;
			for (int i = 0; i < tam; i++) {
				if (texto.charAt(i)!=' ') {
					cadena+=texto.charAt(i);
				}else {
					if (texto.charAt(i)==' ' && texto.charAt(i+1)==' ' &&texto.charAt(i+2)==' ') {
						tipo=0;
						i=i+2;
						bandera=3;
					} 
					if (bandera==0) {
						tipo=getTipoMorse(cadena);
						switch (tipo) {
						case 1:
							textoT+=getMorse(cadena,tipo);
							break;
						case 2:
							textoT+=getMorse(cadena,tipo);
							break;
						default:
							textoT+=" ";
							break;
						}
						cadena="";
					}else {
						tipo=getTipoMorse(cadena);
						textoT+=getMorse(cadena,tipo);
						textoT+=" ";
						cadena="";
						bandera=0;
					}
				}	
				
			}
			tipo=getTipoMorse(cadena);
			switch (tipo) {
			case 1:
				textoT+=getMorse(cadena,tipo);
				break;
			case 2:
				textoT+=getMorse(cadena,tipo);
				break;
			default:
				textoT+=" ";
				break;
			}
			cadena="";
			aux="";
			System.out.println("EL TEXTO SERÍA: "+textoT);
		}


	}

	public static String getLetra(char letr) {
		String abecedario[]= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		char letra='A';
		String letraMorse="";
		for (int i = 0; i < abecedario.length; i++) {
			if (letr!=letra) {
				letra++;
			} else {
				letraMorse=abecedario[i]+" ";
				return letraMorse;
			}
		}
		return letraMorse;

	}

	public static String getMorse(String letr,int tipo) {
		String morse="";
		if (tipo==1) {
			String abecedario[]= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
			char letra='A';
			for (int i = 0; i < abecedario.length; i++) {
				if (!letr.equalsIgnoreCase(abecedario[i])) {
					letra++;
				} else {
					morse=letra+"";
				}
			}
		} else {
			if(tipo==2) {
				String numeros[]= {"-----",".----","..---","...--","....-",".....","-....","--...","---..","----."};
				int num=0;
				for (int i = 0; i < numeros.length; i++) {
					if (numeros[i].equals(letr)) {
						morse=num+"";
					}else {
						num++;
					}
				}
			}
		}
		return morse;
	}

	public static String getNumero(char numero) {
		String numeros[]= {"-----",".----","..---","...--","....-",".....","-....","--...","---..","----."};
		char num=0;
		String numeroMorse="",number=numero+"";
		for (int i = 0; i < numeros.length; i++) {
			if (Integer.parseInt(number)==num) {
				numeroMorse=numeros[i]+" ";
				return numeroMorse;
			}else {
				num++;
			}
		}
		return numeroMorse;
	}
	public static int getTipo(char letra) {
		if (Character.isDigit(letra)) {
			return 2;
		} else {
			if (letra==' ') {
				return 0;
			} else {
				return 1;
			}
		}
	}
	public static int getTipoMorse(String tipo) {
		if (tipo.length()==5) {
			return 2;
		} else {
			if (tipo.length()!=0) {
				return 1;
			} else {
				return 3;
			}
		}
	}
}

