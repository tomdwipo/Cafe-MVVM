package com.tommyputranto.cafe.mvvm.home;

import android.content.Context;
import android.databinding.ObservableField;
import android.graphics.drawable.Drawable;

import com.squareup.picasso.Picasso;
import com.tommyputranto.cafe.databinding.HomeListBinding;
import com.tommyputranto.cafe.mvvm.base.BaseRowVM;
import com.tommyputranto.cafe.util.BindableFieldTarget;
import com.tommyputranto.cafe_api.dao.HomeListDao;

/**
 * Created by tommy on 9/17/16.
 */
public class HomeListVM extends BaseRowVM<HomeListDao.DATABean, HomeListBinding> {
     public HomeActivityController mController;
    public HomeListDao.DATABean mData;
    public ObservableField<String> bTextNama = new ObservableField<>("");
    public ObservableField<String> bTextAlamat = new ObservableField<>("");
    public ObservableField<Drawable> bImageList = new ObservableField<>();
    private BindableFieldTarget bindableFieldTarget;
    private Context mContext;
    public HomeListVM(Context context, HomeListBinding binding, HomeListDao.DATABean data, HomeActivityController controller) {
        super(context, binding, data);
        mController = controller;
        mData = data;
        mContext = context;
        getData();
    }
    public void getData(){
        if (mData!= null){
            bindableFieldTarget = new BindableFieldTarget(bImageList, mContext.getResources());
            Picasso picasso = Picasso.with(mContext);
            picasso.load(mData.getUrl_foto())
                    .resize(300, 300)
                    .centerCrop()
                    .into(bindableFieldTarget);
            bTextNama.set(mData.getNama());
            bTextAlamat.set(mData.getAlamat());
        }
    }
}
