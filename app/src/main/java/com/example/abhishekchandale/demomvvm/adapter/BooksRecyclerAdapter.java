package com.example.abhishekchandale.demomvvm.adapter;


import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abhishekchandale.demomvvm.BR;
import com.example.abhishekchandale.demomvvm.R;
import com.example.abhishekchandale.demomvvm.model.Book;
import java.util.List;


/**
 * Created by Abhishek on 14/3/2017.
 */
public class BooksRecyclerAdapter extends RecyclerView.Adapter<BooksRecyclerAdapter.BindingHolder> {
    private List<Book> mBooks;

    public static class BindingHolder extends RecyclerView.ViewHolder {
        private ViewDataBinding binding;

        public BindingHolder(View v) {
            super(v);
            binding = DataBindingUtil.bind(v);
        }

        public ViewDataBinding getBinding() {
            return binding;
        }
    }

    public BooksRecyclerAdapter(List<Book> recyclerUsers) {
        this.mBooks = recyclerUsers;
    }

    @Override
    public BindingHolder onCreateViewHolder(ViewGroup parent, int type) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_search_result, parent, false);
        BindingHolder holder = new BindingHolder(v);
        return holder;
    }

    @Override
    public void onBindViewHolder(BindingHolder holder, int position) {
        final Book book = mBooks.get(position);

        holder.getBinding().setVariable(BR.book,book);
        holder.getBinding().executePendingBindings();
    }

    @Override
    public int getItemCount() {
        return mBooks.size();
    }
}