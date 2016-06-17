package adapter;

import java.util.List;

import com.it.listviwe.R;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public abstract class Myadapter<T> extends CommonAdapter<T> {
	


	public Myadapter(Context context, List<T> mDatas, int itemLayoutId) {
		super(context, mDatas, itemLayoutId);
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
//		 ViewHolder viewHolder = null;  
//	        if (convertView == null)  
//	        {  
//	            convertView = mInflater.inflate(R.layout.item, parent,  
//	                    false);  
//	            viewHolder = new ViewHolder();  
//	            viewHolder.mTextView = (TextView) convertView  
//	                    .findViewById(R.id.id_tv_title);  
//	            convertView.setTag(viewHolder);  
//	        } else  
//	        {  
//	            viewHolder = (ViewHolder) convertView.getTag();  
//	        }  
//	        viewHolder.mTextView.setText(mDatas.get(position));  
//	        return convertView;  
		 //实例化一个viewHolder  
        ViewHolder viewHolder = ViewHolder.get(mContext, convertView, parent,  
                R.layout.item, position);  
        //通过getView获取控件  
        TextView tv = viewHolder.getView(R.id.id_tv_title);  
        //使用  
        tv.setText((String)mDatas.get(position));  
        return viewHolder.getConvertView();  
	}
	

}
