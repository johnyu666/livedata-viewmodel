package cn.johnyu.xj_temp01;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {

    private MutableLiveData<User>  data;

    public MyViewModel() {
        data=new MutableLiveData<>();
        User user=new User();
        user.setUname("John Yu");
        data.setValue(user);

    }

    public MutableLiveData<User> getData() {
        return data;
    }

    public void setData(User u){
        data.setValue(u);
    }
}
