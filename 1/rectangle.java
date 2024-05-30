public class Rectangle{
  double height = -1;
  double width = -1;
  
  public Rectangle(){
    
  }
  
  public Rectangle(double h, double w){
      height = h;
      width = w;
  }
  
  public double getArea(){
      if (height >= 0 && width >= 0){
          return height * width;
      }
      return 0;
  }
  
  public double getPerimetr(){
      if (height >= 0 && width >= 0)
      {
          return (2*(height+width));
      }
      return 0;
  }
}