package modelo;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Romanos {
	public static void main(String[] args) {
		Scanner lector=new Scanner(System.in);
		String numero="";
		String numRomanoRepetir[]= {"I","X","C","M"};
		String numRomanoSoloUno[]= {"V","L","D"};
		int tam=0;

		do{
			System.out.println("------------------------------  Conversion de un número a NÚMERO ROMANO  ------------------------------\n---------------  NOTA: EL NUMERO INGRESADO DEBE DE ESTAR ENTRE UN RANGO DE 1 a 1000  ---------------\nIngrese el numero que desea convertir");
			numero=lector.nextLine();
			tam=numero.length();
			if (tam==0 || numero.charAt(0)==' '||!isNumero(numero)) {
				System.out.println("Favor de ingresar solo numeros");
			}else {
				if (!isRango(numero)) {
					System.out.println("Favor de ingresar un numero entre el RANGO: 1 - 1000");
				} 
			}
		}while (tam==0 || numero.charAt(0)==' ' ||!isNumero(numero)||!isRango(numero));
		String romano="";
		tam=numero.length();
		switch (tam) {
		case 1:
			for (int i = 0; i < tam; i++) {
				char unidad=numero.charAt(i);
				int u=Integer.parseInt(unidad+"");
				if (u>8) {
					romano+=numRomanoRepetir[tam-1]+""+numRomanoRepetir[tam];
				} else {
					if (u>5) {
						romano+=numRomanoSoloUno[tam-1];
						System.out.println(u);
						int uni=u-5;
						for (int j = 0; j < uni; j++) {
							romano+=numRomanoRepetir[tam-1];
						}
					} else {
						if (u==5) {
							romano+=numRomanoSoloUno[tam-1];
						}else {
							if (u<4) {
								System.out.println(u);
								for (int j = 0; j < u; j++) {
									romano+=numRomanoRepetir[tam-1];
								}
							} else {
								System.out.println(u);
								for (int j = 0; j < 1; j++) {
									romano+=numRomanoRepetir[tam-1]+numRomanoSoloUno[tam-1];
								}
							}
						}
					}
				}
			}
			System.out.println("El número ingresado fue: "+numero);
			System.out.println("El número ROMANO es: "+romano);
			break;
		case 2:
			for (int i = 0; i < tam; i++) {
				switch (i) {
				case 0:
					char decena=numero.charAt(i);
					int d=Integer.parseInt(decena+"");
					if (d>8) {
						romano+=numRomanoRepetir[tam-1]+""+numRomanoRepetir[tam];
					} else {
						if (d>5) {
							romano+=numRomanoSoloUno[tam-1];
							System.out.println(d);
							int dec=d-5;
							for (int j = 0; j < dec; j++) {
								romano+=numRomanoRepetir[tam-1];
							}
						} else {
							if (d==5) {
								romano+=numRomanoSoloUno[tam-1];
							} else {
								if (d<4) {
									System.out.println(d);
									for (int j = 0; j < d; j++) {
										romano+=numRomanoRepetir[tam-1];
									}
								}else {
									System.out.println(d);
									for (int j = 0; j < 1; j++) {
										romano+=numRomanoRepetir[tam-1]+""+numRomanoSoloUno[tam];
									}
								}
							}
						}
					}
					break;
				case 1:
					char unidad=numero.charAt(i);
					int u=Integer.parseInt(unidad+"");
					if (u>8) {
						romano+=numRomanoRepetir[tam-2]+""+numRomanoRepetir[tam-1];
					} else {
						if (u>5) {
							romano+=numRomanoSoloUno[tam-2];
							System.out.println(u);
							int uni=u-5;
							for (int j = 0; j < uni; j++) {
								romano+=numRomanoRepetir[tam-2];
							}
						} else {
							if (u==5) {
								romano+=numRomanoSoloUno[tam-2];
							}else {
								if (u<4) {
									System.out.println(u);
									for (int j = 0; j < u; j++) {
										romano+=numRomanoRepetir[tam-2];
									}
								} else {
									System.out.println(u);
									for (int j = 0; j < 1; j++) {
										romano+=numRomanoRepetir[tam-2]+numRomanoSoloUno[tam-2];
									}
								}
							}
						}
					}
					break;
				default:
					break;
				}
			}
			System.out.println("El número ingresado fue: "+numero);
			System.out.println("El número ROMANO es: "+romano);
			break;
		case 3:
			for (int i = 0; i < tam; i++) {
				switch (i) {
				case 0:
					char centena=numero.charAt(i);
					int c=Integer.parseInt(centena+"");
					if (c>8) {
						romano=numRomanoRepetir[tam-1]+""+numRomanoRepetir[tam];
					} else {
						if (c>5) {
							romano=numRomanoSoloUno[tam-1];
							System.out.println(c);
							int cen=c-5;
							for (int j = 0; j < cen; j++) {
								romano+=numRomanoRepetir[tam-1];
							}
						} else {
							if (c==5) {
								romano=numRomanoSoloUno[tam-1];
							}else {
								if (c<4) {
									System.out.println(c);
									for (int j = 0; j < c; j++) {
										romano+=numRomanoRepetir[tam-1];
									}
								} else {
									System.out.println(c);
									for (int j = 0; j < 1; j++) {
										romano+=numRomanoRepetir[tam-1]+""+numRomanoSoloUno[tam-1];
									}
								}
							}
						}
					}
					break;
				case 1:
					char decena=numero.charAt(i);
					int d=Integer.parseInt(decena+"");
					if (d>8) {
						romano+=numRomanoRepetir[tam-2]+""+numRomanoRepetir[tam-1];
					} else {
						if (d>5) {
							romano+=numRomanoSoloUno[tam-2];
							System.out.println(d);
							int dec=d-5;
							for (int j = 0; j < dec; j++) {
								romano+=numRomanoRepetir[tam-2];
							}
						} else {
							if (d==5) {
								romano+=numRomanoSoloUno[tam-2];
							} else {
								if (d<4) {
									for (int j = 0; j < d; j++) {
										romano+=numRomanoRepetir[tam-2];
									}
								}else {
									for (int j = 0; j < 1; j++) {
										romano+=numRomanoRepetir[tam-2]+""+numRomanoSoloUno[tam-2];
									}
								}
							}
						}
					}
					break;
				case 2:
					char unidad=numero.charAt(i);
					int u=Integer.parseInt(unidad+"");
					if (u>8) {
						romano+=numRomanoRepetir[tam-3]+""+numRomanoRepetir[tam-2];
					} else {
						if (u>5) {
							romano+=numRomanoSoloUno[tam-3];
							System.out.println(u);
							int uni=u-5;
							for (int j = 0; j < uni; j++) {
								romano+=numRomanoRepetir[tam-3];
							}
						} else {
							if (u==5) {
								romano+=numRomanoSoloUno[tam-3];
							}else {
								if (u<4) {
									for (int j = 0; j < u; j++) {
										romano+=numRomanoRepetir[tam-3];
									}
								} else {
									for (int j = 0; j < 1; j++) {
										romano+=numRomanoRepetir[tam-3]+numRomanoSoloUno[tam-3];
									}
								}
							}
						}
					}
					break;
				default:
					break;
				}
			}
			System.out.println("El número ingresado fue: "+numero);
			System.out.println("El número ROMANO es: "+romano);
			break;
		case 4:
			romano=numRomanoRepetir[tam-1];
			System.out.println("El número ingresado fue: "+numero);
			System.out.println("El número ROMANO es: "+romano);
			break;

		default:
			break;
		}

	}

	public static boolean isNumero(String numero) {
		try {
			Integer.parseInt(numero);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	public static boolean isRango(String numero) {
		int num=Integer.parseInt(numero);
		try {
			Integer.parseInt(numero);
			if (num<=1000) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}
}
