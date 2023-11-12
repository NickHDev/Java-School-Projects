import org.w3c.dom.Attr;

public class Visitor {
    int age,height,money;
}
class Attraction{
    String name;
    int rating,visitCount = 0;
}
abstract class Stall{
    String name,ownerName;
    int rating,parkingSpot;
}

