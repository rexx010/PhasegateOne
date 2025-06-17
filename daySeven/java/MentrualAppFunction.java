import java.time.LocalDate;
public class MentrualAppFunction{

public static String begin(int year, int month, int day){
LocalDate start = LocalDate.of(year, month, day);
return "Your cycle starts on the "+start;
}


public static String flowDate(int year, int month, int day){
LocalDate start = LocalDate.of(year, month, day);
LocalDate stop = start.plusDays(5);
return "your flow starts on "+start+" it ends on "+stop;
}


public static String finish(int year, int month, int day, int cycle){
LocalDate check = LocalDate.of(year, month, day);
LocalDate end = check.plusDays(cycle);
return "Your cycle ends on the "+end;
}


public static String ovulation(int year, int month, int day, int cycle){
LocalDate starting = LocalDate.of(year, month, day);
LocalDate ending = starting.plusDays(cycle);
LocalDate ovuStart = ending.minusDays(16);
LocalDate ovuEnd = ending.minusDays(12);
return "your ovulation starts on "+ovuStart+" it ends on "+ovuEnd;
}


public static String fertileLength(int year, int month, int day, int cycle){
LocalDate started = LocalDate.of(year, month, day);
LocalDate ended = started.plusDays(cycle);
LocalDate ferileStart = ended.minusDays(21);
LocalDate ferileEnd = ended.minusDays(12);
return "your fertility starts on the "+ferileStart+" it ends on the "+ferileEnd;
}


public static String safeperiod(int year, int month, int day, int cycle){
LocalDate started = LocalDate.of(year, month, day);
LocalDate ended = started.plusDays(cycle);
LocalDate ferileStart = ended.minusDays(21);
LocalDate ferileEnd = ended.minusDays(12);
return "All days are safe to have fun excluding days within "+ferileStart+" and "+ferileEnd;
}






}
import java.time.LocalDate;
public class MentrualAppFunction{

public static String begin(int year, int month, int day){
if(year > 9999){
return "Year can't have more than 5 digits";
}
else if(month > 12){
return "Months can't have more than 12";
}
else if(day > 30 || day > 31){
return "Days can't have more than 30 or 31";
}
else if(year < 1000 || month < 1 || day < 1){
return "Invalid input";
}else{
LocalDate start = LocalDate.of(year, month, day);
return "Your cycle starts on the "+start;
}
}

public static String flowDate(int year, int month, int day){
if(year > 9999){
return "Year can't have more than 5 digits";
}
else if(month > 12){
return "Months can't have more than 12";
}
else if(day > 30 || day > 31){
return "Days can't have more than 30 or 31";
}
else if(year < 1000 || month < 1 || day < 1){
return "Invalid input";
}else{
LocalDate start = LocalDate.of(year, month, day);
LocalDate stop = start.plusDays(5);
return "your flow starts on "+start+" it ends on "+stop;
}
}

public static String finish(int year, int month, int day, int cycle){
if(year > 9999){
return "Year can't have more than 5 digits";
}
else if(month > 12){
return "Months can't have more than 12";
}
else if(day > 30 || day > 31){
return "Days can't have more than 30 or 31";
}
else if(year < 1000 || month < 1 || day < 1){
return "Invalid input";
}else{
LocalDate check = LocalDate.of(year, month, day);
LocalDate end = check.plusDays(cycle);
return "Your cycle ends on the "+end;
}
}

public static String ovulation(int year, int month, int day, int cycle){
if(year > 9999){
return "Year can't have more than 5 digits";
}
else if(month > 12){
return "Months can't have more than 12";
}
else if(day > 30 || day > 31){
return "Days can't have more than 30 or 31";
}
else if(year < 1000 || month < 1 || day < 1){
return "Invalid input";
}else{
LocalDate starting = LocalDate.of(year, month, day);
LocalDate ending = starting.plusDays(cycle);
LocalDate ovuStart = ending.minusDays(16);
LocalDate ovuEnd = ending.minusDays(12);
return "your ovulation starts on "+ovuStart+" it ends on "+ovuEnd;
}
}

public static String fertileLength(int year, int month, int day, int cycle){
if(year > 9999){
return "Year can't have more than 5 digits";
}
else if(month > 12){
return "Months can't have more than 12";
}
else if(day > 30 || day > 31){
return "Days can't have more than 30 or 31";
}
else if(year < 1000 || month < 1 || day < 1){
return "Invalid input";
}else{
LocalDate started = LocalDate.of(year, month, day);
LocalDate ended = started.plusDays(cycle);
LocalDate ferileStart = ended.minusDays(21);
LocalDate ferileEnd = ended.minusDays(12);
return "your fertility starts on the "+ferileStart+" it ends on the "+ferileEnd;
}
}

public static String safeperiod(int year, int month, int day, int cycle){
if(year > 9999){
return "Year can't have more than 5 digits";
}
else if(month > 12){
return "Months can't have more than 12";
}
else if(day > 30 || day > 31){
return "Days can't have more than 30 or 31";
}
else if(year < 1000 || month < 1 || day < 1){
return "Invalid input";
}else{
LocalDate started = LocalDate.of(year, month, day);
LocalDate ended = started.plusDays(cycle);
LocalDate ferileStart = ended.minusDays(21);
LocalDate ferileEnd = ended.minusDays(12);
return "All days are safe to have fun excluding days within "+ferileStart+" and "+ferileEnd;
}
}





}
