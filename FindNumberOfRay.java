import java.util.HashMap;
import java.util.Map;


class FindNumberOfRay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point2D a = new Point2D();
		a.x = -1;
		a.y = -2;
		Point2D b = new Point2D();
		b.x = 1;
		b.y = 2;
		Point2D c = new Point2D();
		c.x = 2;
		c.y = 4;
		Point2D d = new Point2D();
		d.x = -3;
		d.y = 2;
		Point2D e = new Point2D();
		e.x = 2 ;
		e.y = -2;
		
		Point2D[] as = {a,b,c,d,e};
		
System.out.println(new FindNumberOfRay().solution(as));
	}
	 public int solution(Point2D[] A) {
	        // write your code in Java SE 8
		 
		 Map<Point2D, Integer> map = new HashMap<Point2D, Integer>();
		 boolean mapFound = false;
		 for (Point2D point2d : A) {
			 mapFound = false;
			for (Point2D key : map.keySet()) {
				
				boolean inSameAuarter = (key.x >= 0 && point2d.x >= 0 && key.y >=0 && point2d.y >= 0) ||
										(key.x <= 0 && point2d.x <=0 && key.y >= 0 && point2d.y >= 0) ||
										(key.x <= 0 && point2d.x <=0 && key.y <= 0 && point2d.y <= 0) ||
										(key.x >= 0 && point2d.x>= 0 && key.y <= 0 && point2d.y <= 0);
				if(inSameAuarter){
					boolean onSameLine = ((key.x >= point2d.x) ? ((key.x % point2d.x == 0) && (key.y % point2d.y == 0)): false) ||
										((key.x < point2d.x) ? ((point2d.x % key.x == 0) && (point2d.y % key.y == 0)): false);
					if(onSameLine){
						mapFound = true;
					}
				}
			}
			if(!mapFound){
				map.put(point2d, 1);
			}
		}
		 
		 return map.keySet().size();
	    }
}


class Point2D {
	  public int x;
	  public int y;
	}
