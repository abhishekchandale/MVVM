package com.example.abhishekchandale.demomvvm.viewmodel;

import android.databinding.ObservableField;

import com.example.abhishekchandale.demomvvm.adapter.BooksRecyclerAdapter;
import com.example.abhishekchandale.demomvvm.model.Book;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abhishek.Chandale on 3/14/2017.
 */

public class BookViewModel  implements  ViewModelInterface {
    Book model=new Book();
    BooksRecyclerAdapter adapter;
    List<Book> list=new ArrayList<>();
    public final ObservableField<String> addText = new ObservableField<>();

    @Override
    public void onCreate() {

    }

    @Override
    public void onPause() {
    }

    @Override
    public void onResume() {

    }

    @Override
    public void onDestroy() {

    }

    public void addBook(String bookName){
     model.setBookName(bookName);
     addText.set(model.getBookName());
    }



}
