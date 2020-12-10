package examples.date_api;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateApi {

	
	public void verificar(int version) {
		if (version==7){
			Calendar fecha_1= Calendar.getInstance();
			Calendar fecha_2= Calendar.getInstance();
			
			fecha_1.set(1991,0,21);
			System.out.println(fecha_1.after(fecha_2));
		}else if(version==8) {
			//Fecha
			LocalDate fecha_1 = LocalDate.of(1991, 01,21);
			LocalDate fecha_2 = LocalDate.now();
					
			System.out.println(fecha_1.isAfter(fecha_2));
			System.out.println(fecha_1.isBefore(fecha_2));
		
			//LOCAL TIME ->(HORA,MIN,SEG)
			LocalTime time = LocalTime.of(22, 30,50);
			LocalTime time_2= LocalTime.now();
			
			System.out.println(time.isAfter(time_2));
			System.out.println(time.isBefore(time_2));
			//Fecha tiempo
			LocalDateTime fecha_time= LocalDateTime.of(1991,1,21,22,30,50);
			LocalDateTime fecha_time2= LocalDateTime.now();
			
			System.out.println(fecha_time.isAfter(fecha_time2));
			System.out.println(fecha_time.isBefore(fecha_time2));
			
		}
	}
		// currentTimeMillis
		public void medirTiempo(int version) throws InterruptedException {
			if (version == 7) {
				long ini = System.currentTimeMillis();
				Thread.sleep(1000);
				long fin = System.currentTimeMillis();
				System.out.println(fin - ini);
			} else if (version == 8) {
				Instant ini = Instant.now();
				Thread.sleep(1000);
				Instant fin = Instant.now();
				System.out.println(Duration.between(ini, fin));
			}
		}

		// Calendar
		public void periodoEntreFechas(int version) {
			if (version == 7) {
				Calendar nacimiento = Calendar.getInstance();
				Calendar actual = Calendar.getInstance();

				nacimiento.set(1991, 0, 21);
				actual.set(2017, 2, 04);

				int anios = 0;

				while (nacimiento.before(actual)) {
					nacimiento.add(Calendar.YEAR, 1);
					if (nacimiento.before(actual)) {
						anios++;
					}
				}
				System.out.println(anios);
			} else if (version == 8) {
				LocalDate nacimiento = LocalDate.of(1991, 1, 21);
				LocalDate actual = LocalDate.now();

				Period periodo = Period.between(nacimiento, actual);
				System.out.println("Han transcurrido " + periodo.getYears() + " años y " + periodo.getMonths() + " meses y "
						+ periodo.getDays() + " dias, desde " + nacimiento + " hasta " + actual);
			}
		}

		// Conversion
		public void convertir(int version) throws ParseException {
			if (version == 7) {
				String fecha = "21/01/1991";
				DateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
				Date fechaConvertida = formateador.parse(fecha);
				System.out.println(fechaConvertida);

				Date fechaActual = Calendar.getInstance().getTime();
				formateador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss a");
				String fechaCadena = formateador.format(fechaActual);
				System.out.println(fechaCadena);
			} else if (version == 8) {
				String fecha = "21/01/1991";
				DateTimeFormatter formateador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				LocalDate fechaLocal = LocalDate.parse(fecha, formateador);
				System.out.println(fechaLocal);
				
				formateador = DateTimeFormatter.ofPattern("ddMMyyyy");
				System.out.println(formateador.format(fechaLocal));
			}
		}
		
	
	public static void main(String[] args) {
		DateApi app = new DateApi();
		app.verificar(8);
	}
}
