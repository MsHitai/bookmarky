package com.bookmarky;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TreeView;

public class BookmarkyController {

    public TreeView<Bookmark> bookmarkTreeView;
    @FXML
    private Label bookmarky;

    @FXML
    protected void onViewAllClick() {
        bookmarky.setText("There are no bookmarks yet");
    }

    @FXML
    protected void onSearchClick() {
        bookmarky.setText("There are no bookmarks yet");
    }

    @FXML
    protected void onAddBookmarkClick() {
        bookmarky.setText("There are no bookmarks yet");
    }
}
