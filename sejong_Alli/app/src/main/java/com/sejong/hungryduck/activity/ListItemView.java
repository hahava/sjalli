package com.sejong.hungryduck.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.sejong.hungryduck.data.SampleData;
import com.sejong.hungryduck.model.Postings;
import com.sejong.hungryduck.sejong.R;

public class ListItemView extends Activity {

	private TextView maintitle;
	private TextView secondtitle;
	private TextView secondhost;
	private TextView seconddate;
	private TextView attend;
	private TextView contents;
	private TextView benefits;
	private TextView date;
	private TextView reception;
	private TextView notice;
	private TextView contact;
	private ImageView secondImage;
	private ImageButton kakaobtn, facebookbtn;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.detail_info);
		setViewBinding(getIntent().getExtras().getInt("itemNumber"));
	}

	private void setViewBinding(int position) {
		Postings selectedItem = SampleData.getInstance().getListItems(position);
		maintitle = (TextView)findViewById(R.id.detailTitle);
		secondtitle = (TextView)findViewById(R.id.smallTitle);
		secondhost = (TextView)findViewById(R.id.smallHost);
		seconddate = (TextView)findViewById(R.id.smallDate);
		attend = (TextView)findViewById(R.id.attendCondition);
		contents = (TextView)findViewById(R.id.contents);
		benefits = (TextView)findViewById(R.id.benefits);
		date = (TextView)findViewById(R.id.date);
		reception = (TextView)findViewById(R.id.reception);
		notice = (TextView)findViewById(R.id.notice);
		contact = (TextView)findViewById(R.id.contactInformation);
		secondImage = (ImageView)findViewById(R.id.detailImage);
		kakaobtn = (ImageButton)findViewById(R.id.kakaoButton);
		facebookbtn = (ImageButton)findViewById(R.id.facebookButton);

		maintitle.setText(selectedItem.getMainTitle());
		secondtitle.setText(selectedItem.getSecondTitle());
		secondhost.setText(selectedItem.getHost());
		seconddate.setText(selectedItem.getEndDate());
		attend.setText(selectedItem.getLimitingCondition());
		contents.setText(selectedItem.getContents());
		benefits.setText(selectedItem.getWinnerPrize());
		date.setText(selectedItem.getStartDate());
		reception.setText(selectedItem.getReception());
		notice.setText(selectedItem.getNotice());
		contact.setText(selectedItem.getContact());
	}
}