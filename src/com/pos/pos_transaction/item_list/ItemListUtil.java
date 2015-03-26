/*
 *  ItemListUtil.java
 *  
 *  @author Channa Mohan
 *     hjchanna@gmail.com
 *  
 *  Created on Mar 24, 2015, 4:16:18 PM
 *  Copyrights channa mohan, All rights reserved.
 *  
 */
package com.pos.pos_transaction.item_list;

import com.pos.pos_transaction.item_list.object.MDepartment;
import com.pos.pos_transaction.item_list.object.MItem;
import com.pos.pos_transaction.item_list.object.MMainCategory;
import com.pos.pos_transaction.item_list.object.MSubCategory;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author mohan
 */
public class ItemListUtil {

    //
    private List<ItemSelectListener> itemSelectListeners = new ArrayList<>();
    //
    private JList list;
    private ItemListModel itemListModel;

    private ItemListUtil(JList list, List<MItem> items) {
        this.list = list;
        setItems(items);
        initOthers();
    }

    public static ItemListUtil getInstance(JList list, List<MItem> items) {
        ItemListUtil itemListUtil = new ItemListUtil(list, items);
        return itemListUtil;
    }

    private void initOthers() {
        list.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (list.getSelectedValue() != null && e.getValueIsAdjusting()) {
                    fireItemSelectListner(itemListModel.getMode(), list.getSelectedValue());
                }
            }
        });
    }

    public final void setItems(List<MItem> items) {
        Set<MDepartment> departments = new HashSet<>();
        Set<MMainCategory> mainCategories = new HashSet<>();
        Set<MSubCategory> subCategory = new HashSet<>();

        for (MItem mItemData : items) {
            departments.add(mItemData.getMDepartment());
            mainCategories.add(mItemData.getMMainCategory());
            subCategory.add(mItemData.getMSubCategory());
        }

        itemListModel = new ItemListModel(
                items,
                new ArrayList<>(departments),
                new ArrayList<>(mainCategories),
                new ArrayList<>(subCategory));
        list.setModel(itemListModel);
    }

    public void goBack() {
        itemListModel.goBack();
    }

    public void addItemSelectListner(ItemSelectListener itemSelectListener) {
        itemSelectListeners.add(itemSelectListener);
    }

    private void fireItemSelectListner(String mode, Object value) {
        for (ItemSelectListener itemSelectListener : itemSelectListeners) {
            itemSelectListener.itemSelectionChanged(mode, value);
        }
    }
}
