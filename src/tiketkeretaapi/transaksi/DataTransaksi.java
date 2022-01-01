package tiketkeretaapi.transaksi;

/**
 *
 * @author RZ
 */
class DataTransaksi {
	private String asal, tujuan, tanggal, kereta;
	int hariNum, jmlPenumpang;

	public DataTransaksi(String asal, String tujuan, String tanggal, int hariNum, String kereta, int jmlPenumpang) {
		this.asal = asal;
		this.tujuan = tujuan;
		this.tanggal = tanggal;
		this.kereta = kereta;
		this.hariNum = hariNum;
		this.jmlPenumpang = jmlPenumpang;
	}

	public String getAsal() {
		return asal;
	}

	public String getTujuan() {
		return tujuan;
	}

	public String getTanggal() {
		return tanggal;
	}

	public String getKereta() {
		return kereta;
	}

	public int getHariNum() {
		return hariNum;
	}

	public int getJmlPenumpang() {
		return jmlPenumpang;
	}
}
