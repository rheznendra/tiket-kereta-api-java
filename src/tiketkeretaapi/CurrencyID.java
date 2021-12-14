package tiketkeretaapi;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
 * @author RZ
 */
public class CurrencyID {

	double nominal;

	public CurrencyID(double n) {
		nominal = n;
	}

	@Override
	public String toString() {
		DecimalFormat kursIndonesia = (DecimalFormat) DecimalFormat.getCurrencyInstance();
		DecimalFormatSymbols formatRupiah = new DecimalFormatSymbols();

		formatRupiah.setCurrencySymbol("Rp. ");
		formatRupiah.setMonetaryDecimalSeparator(',');
		formatRupiah.setGroupingSeparator('.');

		kursIndonesia.setMinimumFractionDigits(0);
		kursIndonesia.setDecimalFormatSymbols(formatRupiah);
		return kursIndonesia.format((double) nominal);
	}
}
