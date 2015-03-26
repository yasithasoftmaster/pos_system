/*
 *  ItemListModel.java
 *  
 *  @author Channa Mohan
 *     hjchanna@gmail.com
 *  
 *  Created on Mar 24, 2015, 4:15:58 PM
 *  Copyrights channa mohan, All rights reserved.
 *  
 */
package com.pos.pos_transaction.item_list;

import com.pos.pos_transaction.item_list.object.MDepartment;
import com.pos.pos_transaction.item_list.object.MItem;
import com.pos.pos_transaction.item_list.object.MMainCategory;
import com.pos.pos_transaction.item_list.object.MSubCategory;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ListModel;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

/**
 *
 * @author mohan
 */
public class ItemListModel implements ListModel {
    //LISTENERS

    private List<ListDataListener> listDataListeners = new ArrayList<>();
    //DATA
    private List<MDepartment> departments;
    private List<MMainCategory> mainCategory;
    private List<MSubCategory> subCategory;
    private List<MItem> items;
    //MODES
    private static final String DEPARTMENT = "DEPARTMENT";
    private static final String MAIN_CATEGORY = "MAIN_CATEGORY";
    private static final String SUB_CATEGORY = "SUB_CATEGORY";
    private static final String ITEM = "ITEM";
    //
    private String mode;

    public ItemListModel(List<MItem> items, List<MDepartment> departments, List<MMainCategory> mainCategory, List<MSubCategory> subCategory) {
        this.items = items;
        this.departments = departments;
        this.mainCategory = mainCategory;
        this.subCategory = subCategory;
        this.mode = DEPARTMENT;
    }

    public void setMode(String mode) {
        this.mode = mode;
        fireContentChanged();
    }

    public String getMode() {
        return mode;
    }

    @Override
    public int getSize() {
        switch (mode) {
            case ITEM:
                return items.size();
            case DEPARTMENT:
                return departments.size();
            case MAIN_CATEGORY:
                return mainCategory.size();
            case SUB_CATEGORY:
                return subCategory.size();
            default:
                throw new AssertionError();
        }
    }

    @Override
    public Object getElementAt(int index) {
        switch (mode) {
            case ITEM:
                return items.get(index);
            case DEPARTMENT:
                return departments.get(index);
            case MAIN_CATEGORY:
                return mainCategory.get(index);
            case SUB_CATEGORY:
                return subCategory.get(index);
            default:
                throw new AssertionError();
        }
    }

    private String getBackMode(String mode) {
        switch (mode) {
            case DEPARTMENT:
                return DEPARTMENT;
            case MAIN_CATEGORY:
                return DEPARTMENT;
            case SUB_CATEGORY:
                return MAIN_CATEGORY;
            default:
                throw new AssertionError();
        }
    }

    public void goBack() {
        setMode(getBackMode(mode));
        fireContentChanged();
    }

    private void fireContentChanged() {
        for (ListDataListener listDataListener : listDataListeners) {
            listDataListener.contentsChanged(new ListDataEvent(this, ListDataEvent.CONTENTS_CHANGED, 0, getSize()));
        }
    }

    @Override
    public void addListDataListener(ListDataListener l) {
        listDataListeners.add(l);
    }

    @Override
    public void removeListDataListener(ListDataListener l) {
        listDataListeners.remove(l);
    }
}
