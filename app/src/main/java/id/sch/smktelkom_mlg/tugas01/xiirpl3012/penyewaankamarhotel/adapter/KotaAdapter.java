package id.sch.smktelkom_mlg.tugas01.xiirpl3012.penyewaankamarhotel.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.AbstractList;

import id.sch.smktelkom_mlg.tugas01.xiirpl3012.penyewaankamarhotel.R;

/**
 * Created by dini puji lestari on 08/29/2016.
 */
public class KotaAdapter extends ArrayAdapter<String> {
    String mProvinsi = "";

    public KotaAdapter(Context context, AbstractList<String> listKota) {
        super(context, R.layout.row_spinner_kota, listKota);
    }

    public void setmProvinsi(String Provinsi) {
        this.mProvinsi = Provinsi;
    }

    @Override
    public View getView(int position, View View, ViewGroup parent) {
        return getCustomView(position, View, parent);
    }

    @Override
    public View getDropDownView(int position, View View, ViewGroup parent) {
        return getCustomView(position, View, parent);
    }

    private View getCustomView(int position, View view, ViewGroup parent) {
        if (view == null)
            view = LayoutInflater.from(getContext()).inflate(R.layout.row_spinner_kota, parent, false);

        TextView tvTitle = (TextView) view.findViewById(R.id.textViewTitle);
        tvTitle.setText(getItem(position).substring(0, 1));
        TextView tvKota = (TextView) view.findViewById(R.id.textViewKota);
        tvKota.setText(getItem(position));
        TextView tvProvinsi = (TextView) view.findViewById(R.id.textViewProvinsi);
        tvProvinsi.setText(mProvinsi);

        return view;
    }
}
