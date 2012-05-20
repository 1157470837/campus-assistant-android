package com.techthinker.CAAndroid.widget.Adapter;

import java.io.FileNotFoundException;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class Learn_DicCoverAdapter extends BaseAdapter {
	int mGalleryItemBackground;
	private Context mContext;
//	private List<Dictionary> allDics;
	private ImageView[] mImages;

	public Learn_DicCoverAdapter(Context c) {
//		mContext = c;
//		DictionaryDAL dicDAL = new DictionaryDAL(c);
//		dicDAL.open();
//		allDics = dicDAL.fetchAllDictionarys();
//		dicDAL.close();
//		mImages = new ImageView[allDics.size()];
	}

	public boolean createReflectedImages() throws FileNotFoundException {
//		int reflectionGap = Constant.REFLECTION_GAP;
//		int index = 0;
//		for (Dictionary d:allDics) {
//			InputStream input =new FileInputStream(Constant.DEFAULT_SD_PATH+d.getName()+".jpg");
//			Bitmap originalImage = BitmapFactory.decodeStream(input);
//			int width = originalImage.getWidth();
//			int height = originalImage.getHeight();
//			Matrix matrix = new Matrix();
//			matrix.preScale(1, -1);
//			Bitmap reflectionImage = Bitmap.createBitmap(originalImage, 0,
//					height / 2, width, height / 2, matrix, false);
//			Bitmap bitmapWithReflection = Bitmap.createBitmap(width,
//					(height + height / 4), Config.ARGB_8888);
//			Canvas canvas = new Canvas(bitmapWithReflection);
//			canvas.drawBitmap(originalImage, 0, 0, null);
//			Paint deafaultPaint = new Paint();
//			deafaultPaint.setAntiAlias(false);
//			canvas.drawBitmap(reflectionImage, 0, height + reflectionGap, null);
//			Paint paint = new Paint();
//			paint.setAntiAlias(false);
//			LinearGradient shader = new LinearGradient(0,
//					originalImage.getHeight(), 0,
//					bitmapWithReflection.getHeight() + reflectionGap,
//					0x70ffffff, 0x00ffffff, TileMode.MIRROR);
//			paint.setShader(shader);
//			paint.setXfermode(new PorterDuffXfermode(
//					android.graphics.PorterDuff.Mode.DST_IN));
//			canvas.drawRect(0, height, width, bitmapWithReflection.getHeight()
//					+ reflectionGap, paint);
//			ImageView imageView = new ImageView(mContext);
//			imageView.setImageBitmap(bitmapWithReflection);
//			imageView.setLayoutParams(new Learn_GalleryFlow.LayoutParams(
//					Constant.GALLERY_CHILD_WITH, Constant.GALLERY_CHILD_HIGHT));
//			mImages[index++] = imageView;
//			originalImage.recycle();
//		}
		return true;
	}

	@SuppressWarnings("unused")
	private Resources getResources() {
		return null;
	}

	public int getCount() {
		return 0;
	}

	public Object getItem(int position) {
		return position;
	}

	public long getItemId(int position) {
		return position;
	}
//	public String getItemDicName(int position) {
//		return allDics.get(position).getName();
//	}
//	public int getItemDicId(int position) {
//		return allDics.get(position).getDictionary_id();
//	}

	public View getView(int position, View convertView, ViewGroup parent) {
		return mImages[position];
	}

	public float getScale(boolean focused, int offset) {
		return Math.max(0, 1.0f / (float) Math.pow(2, Math.abs(offset)));
	}
}
