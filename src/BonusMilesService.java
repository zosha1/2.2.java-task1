public class BonusMilesService {
  public int calculate (int cost){
    int coefficient = 20;
    int miles = cost / coefficient;
    return miles;
  }
}
