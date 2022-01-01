
package tiketkeretaapi.transaksi;

/**
 *
 * @author RZ
 */
public class DataDetailTransaksi {
	private String ktp, nama, alamat, nohp;

	public DataDetailTransaksi(String ktp, String nama, String alamat, String nohp) {
		this.ktp = ktp;
		this.nama = nama;
		this.alamat = alamat;
		this.nohp = nohp;
	}

	public String getKtp() {
		return ktp;
	}

	public String getNama() {
		return nama;
	}

	public String getAlamat() {
		return alamat;
	}

	public String getNohp() {
		return nohp;
	}
}
