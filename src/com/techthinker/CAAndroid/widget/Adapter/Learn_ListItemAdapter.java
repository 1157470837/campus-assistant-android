package com.techthinker.CAAndroid.widget.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class Learn_ListItemAdapter extends BaseAdapter {

	private LayoutInflater mInflater;
//	private List<Lists> allLists;

	public Learn_ListItemAdapter(Context context,int dictionary_id) {
//		mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//		allLists=new ArrayList<Lists>();
//		ListDAL listDAL = new ListDAL(context);
//		listDAL.open();
//		allLists=listDAL.fetchAllListssByDictionaryId(dictionary_id);
//		listDAL.close();
	}

	public int getCount() {
//		int balance =allLists.size()%Constant.LIST_ITEM_PER_PAGE!=0 ?1:0;
//		int pageNum = allLists.size()/Constant.LIST_ITEM_PER_PAGE+balance;
		return 0;
	}

	public Object getItem(int position) {
		return position;
	}
	
	public long getItemId(int position) {
		return position;
	}

	public View getView(int position, View convertView, ViewGroup parent) {
//		if (convertView == null) {
//			convertView = mInflater.inflate(R.layout.learn_selectlist, null);
//		}
//		List<TextView> allTVs= new ArrayList<TextView>();
//		List<ImageView> allIVs= new ArrayList<ImageView>();
//		
//		TextView tv0=(TextView)convertView.findViewById(R.id.tv_learn_list_item_0);
//		ImageView iv0=(ImageView) convertView.findViewById(R.id.iv_learn_list_item_0);
//		allTVs.add(tv0);
//		allIVs.add(iv0);
//		
//		TextView tv1=(TextView)convertView.findViewById(R.id.tv_learn_list_item_1);
//		ImageView iv1=(ImageView) convertView.findViewById(R.id.iv_learn_list_item_1);
//		allTVs.add(tv1);
//		allIVs.add(iv1);
//		
//		TextView tv2=(TextView)convertView.findViewById(R.id.tv_learn_list_item_2);
//		ImageView iv2=(ImageView) convertView.findViewById(R.id.iv_learn_list_item_2);
//		allTVs.add(tv2);
//		allIVs.add(iv2);
//		
//		TextView tv3=(TextView)convertView.findViewById(R.id.tv_learn_list_item_3);
//		ImageView iv3=(ImageView) convertView.findViewById(R.id.iv_learn_list_item_3);
//		allTVs.add(tv3);
//		allIVs.add(iv3);
//		
//		TextView tv4=(TextView)convertView.findViewById(R.id.tv_learn_list_item_4);
//		ImageView iv4=(ImageView) convertView.findViewById(R.id.iv_learn_list_item_4);
//		allTVs.add(tv4);
//		allIVs.add(iv4);
//		
//		TextView tv5=(TextView)convertView.findViewById(R.id.tv_learn_list_item_5);
//		ImageView iv5=(ImageView) convertView.findViewById(R.id.iv_learn_list_item_5);
//		allTVs.add(tv5);
//		allIVs.add(iv5);
//		
//		TextView tv6=(TextView)convertView.findViewById(R.id.tv_learn_list_item_6);
//		ImageView iv6=(ImageView) convertView.findViewById(R.id.iv_learn_list_item_6);
//		allTVs.add(tv6);
//		allIVs.add(iv6);
//		
//		TextView tv7=(TextView)convertView.findViewById(R.id.tv_learn_list_item_7);
//		ImageView iv7=(ImageView) convertView.findViewById(R.id.iv_learn_list_item_7);
//		allTVs.add(tv7);
//		allIVs.add(iv7);
//		
//		TextView tv8=(TextView)convertView.findViewById(R.id.tv_learn_list_item_8);
//		ImageView iv8=(ImageView) convertView.findViewById(R.id.iv_learn_list_item_8);
//		allTVs.add(tv8);
//		allIVs.add(iv8);
//		
//		TextView tv9=(TextView)convertView.findViewById(R.id.tv_learn_list_item_9);
//		ImageView iv9=(ImageView) convertView.findViewById(R.id.iv_learn_list_item_9);
//		allTVs.add(tv9);
//		allIVs.add(iv9);
//		
//		TextView tv10=(TextView)convertView.findViewById(R.id.tv_learn_list_item_10);
//		ImageView iv10=(ImageView) convertView.findViewById(R.id.iv_learn_list_item_10);
//		allTVs.add(tv10);
//		allIVs.add(iv10);
//		
//		TextView tv11=(TextView)convertView.findViewById(R.id.tv_learn_list_item_11);
//		ImageView iv11=(ImageView) convertView.findViewById(R.id.iv_learn_list_item_11);
//		allTVs.add(tv11);
//		allIVs.add(iv11);
//		
//		for(int i=0;(i<12)&&((i+position*12)<allLists.size());i++){
//			allTVs.get(i).setText(allLists.get(i+position*12).getName());
//			allTVs.get(i).setVisibility(0);
//			allIVs.get(i).setVisibility(0);
//		}
		
		return convertView;
	}

}
