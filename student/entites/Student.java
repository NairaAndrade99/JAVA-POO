package student.entites;


public class Student {
     
        public String name;
        public double notas[];

public double notasFinal(){
      double soma = 0.0;

  for (int i = 0; i < notas.length; i++){
            soma += notas[i];
  }
         return soma;
}
public String resultado (){
     
    if (notasFinal() > 65){
         return "pass";
    }else {
        return "falid";
    }
}
public double falta (){
     
    if ( resultado() == "pass" ){
       return  ' ';
}  else {
       return notasFinal() - 60;
}

}
public String toString (){

      return " Final grade " + String.format("%.2f ", notasFinal()) 
              + "\n " + resultado() +
              "\n Missing " + String.format("%.2f", falta()) +
              " points";
           
            
}

   

         
}
