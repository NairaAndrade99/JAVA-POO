package rectangle.Rectangle;

public class Rectangle {
    
        public double width, height;
    
    public double area(){
        return width * height;
    }
    public double perimeter(){
        return (width + height ) * 2;
    }
    public double diagonal (){
        return Math.sqrt(Math.pow(width, 2 ) + Math.pow(height, 2));

    }
    public String toString(){
         
         return String.format("Area = %.2f",area()) +
                String.format("\n Perimeter = %.2f ",perimeter()) +  
                String.format("\n Diagonal = %.2f", diagonal());
                
    }
    
    }
    

