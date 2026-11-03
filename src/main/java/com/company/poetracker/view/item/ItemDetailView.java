package com.company.poetracker.view.item;

import com.company.poetracker.entity.Item;
import com.company.poetracker.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "items/:id", layout = MainView.class)
@ViewController(id = "Item.detail")
@ViewDescriptor(path = "item-detail-view.xml")
@EditedEntityContainer("itemDc")
public class ItemDetailView extends StandardDetailView<Item> {
}
