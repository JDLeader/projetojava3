package modulosdatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException{
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dataVencimentoBoleto = simpleDateFormat.parse("10/04/2021");
		
		Date dataAtualHoje = simpleDateFormat.parse("11/04/2021");
		
		if(dataVencimentoBoleto.before(dataAtualHoje)) {
			System.out.println("Vencido!\n");
		}else {
			System.out.println("Boleto ainda nao venceu!\n");
		}
		
		
		Calendar calendar = Calendar.getInstance();
		
		Date date = new Date();
		
		System.out.println("Data em milissegundos: " + date.getTime());
		System.out.println("Calendar em milisegundos: " + calendar.getTimeInMillis());
		
		System.out.println("Dia do mês: " + date.getDate());
		System.out.println("Calendar do mes: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Dia d semana: " + date.getDay());
		System.out.println("Calendar da semana: " + (calendar.get(Calendar.DAY_OF_WEEK)));
		
		System.out.println("Hora do dia: " + date.getHours());
		System.out.println("Calendar hora do dia: " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Minutos: " + date.getMinutes());
		System.out.println("Calendar minuto da hora: " + calendar.get(Calendar.MINUTE));
		
		System.out.println("Segundos: " + date.getSeconds());
		System.out.println("Calendar minutos: " + calendar.get(Calendar.SECOND));
		
		System.out.println("Ano: " + (date.getYear() + 1900));
		System.out.println("Calendar ano: " + calendar.get(Calendar.YEAR));
		
		/*------------------Simple Date Format --------------------*/
		
		SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		System.out.println("\nData atual em formato padrão por uma String: " + simpleDateFormat2.format(date));
		System.out.println("Calendar data atual em formato padrão por uma String: " + simpleDateFormat2.format(calendar.getInstance().getTime()));
		
		simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		
		System.out.println("\nData em formato para banco de dados: " + simpleDateFormat2.format(date));
		
		System.out.println("Objeto Date: " + simpleDateFormat2.parse("1987-10-18 20:10.2"));

		
		
	}

}
		
		
		
		
		
		
		
		