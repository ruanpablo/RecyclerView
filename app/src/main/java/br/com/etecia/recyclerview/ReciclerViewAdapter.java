package br.com.etecia.recyclerview;
import android.content.Context;
import java.util.List;


public class RecyclerViewAdapter extends RecyclerView.Adaper<>{

    private Context mContext;
    private List<Evangelistas> mData;

    public RecyclerViewAdapter(Context mContext, List<Evangelistas> mData){
        this.mContext = mContext;
        this.mData = mData;
    }

}
