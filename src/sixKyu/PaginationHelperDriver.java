package sixKyu;
import java.util.List;


public class PaginationHelperDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaginationHelper ph = new PaginationHelper(List.of('a', 'b', 'c', 'd', 'e', 'f'), 4);
		System.out.println(ph.pageItemCount(0));

	}

}

class PaginationHelper<I> {
	private List<I> collection;
	private int itemsPerPage;
	
	public PaginationHelper(List<I> collection, int itemsPerPage) {
		this.collection = collection;
		this.itemsPerPage = itemsPerPage;
	}
	
	public int itemCount() {
		return collection.size();
	}
	
	public int pageCount() {
		return (int) Math.ceil((double)itemCount() / itemsPerPage);
	}
	
	public int pageItemCount(int pageIndex) {
		if (pageIndex > pageCount() - 1 || pageIndex < 0) {
		    return -1;
		  }
		
		return (int) (itemsPerPage - Math.ceil((((pageIndex + 1)*itemsPerPage)%itemCount())%itemsPerPage));
	}
	
	
	public int pageIndex(int itemIndex) {
		if (itemIndex < 0 || itemIndex >= itemCount() || itemCount() == 0) {
			return -1;
		}
		return (int) Math.ceil(((double) itemIndex + 1 )/ itemsPerPage) - 1;
	}
}