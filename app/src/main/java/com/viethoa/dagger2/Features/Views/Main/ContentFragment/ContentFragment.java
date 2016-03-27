package com.viethoa.dagger2.Features.Views.Main.ContentFragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.viethoa.dagger2.BaseApplications.BaseFragment;
import com.viethoa.dagger2.Components.Modules.ApplicationComponent;
import com.viethoa.dagger2.Features.Presenters.ContentPresenter.ContentContract;
import com.viethoa.dagger2.R;

import javax.inject.Inject;

/**
 * Created by VietHoa on 27/03/16.
 */
public class ContentFragment extends BaseFragment implements ContentContract.View {

    @Inject
    ContentContract.UserActions mFragmentPresenter;

    public static ContentFragment newInstance() {
        return new ContentFragment();
    }

    @Override
    protected View setContentView(LayoutInflater inflater, ViewGroup container) {
        return inflater.inflate(R.layout.fragment_content, container, false);
    }

    @Override
    protected void injectModule(ApplicationComponent component) {
        component.inject(this);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mFragmentPresenter.getMessage();
    }

    @Override
    public void showMessage(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_LONG).show();
    }
}
