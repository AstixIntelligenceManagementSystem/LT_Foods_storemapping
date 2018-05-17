package astix.lt_foods_storemapping;

import java.util.ArrayList;

import android.app.Dialog;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public interface SearchListCommunicator {
	
	void selectedOption(String optId, String optionVal, EditText txtVw, ListView listViewOption, String tagVal, Dialog dialog, TextView textView, ArrayList<String> listStoreIDOrigin);
	void selectedStoreMultiple(String optId, String optionVal, EditText txtVw, ListView listViewOption, String tagVal, Dialog dialog, TextView textView, LinearLayout ll_SlctdOpt, ArrayList<String> listSelectedOpt, ArrayList<String> listSelectedStoreID, ArrayList<String> listSelectedStoreOrigin);

}
