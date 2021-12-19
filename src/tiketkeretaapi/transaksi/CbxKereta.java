package tiketkeretaapi.transaksi;

/**
 *
 * @author RZ
 */
public class CbxKereta {

	private String id, title;

	public CbxKereta(String id, String title) {
		this.id = id;
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	@Override
	public String toString() {
		return title;
	}
}
