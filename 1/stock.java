// Определение класса круга с двумя конструкторами
class Stock {
  String symbol;
  String name;
  double  previousClosingPrice;
  double  currentPrice;
  

  /** Создает круг с радиусом, равным 1 */
  Stock() {
    symbol = "NULL";
    name =  "NULL";
    previousClosingPrice = 0;
    currentPrice = 0;
  }

  /** Создает круг с указанным радиусом */
  Stock(String newsymbol, String newname, double pp, double cp) {
    symbol = newsymbol;
    name = newname;
    previousClosingPrice = pp;
    currentPrice = cp; 
  }

  /** Возвращает площадь этого круга */
  double getChangePercent() {
    return (( currentPrice / previousClosingPrice  * 100) - 100);
  }
}