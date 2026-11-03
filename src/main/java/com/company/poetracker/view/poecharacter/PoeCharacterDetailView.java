package com.company.poetracker.view.poecharacter;

import com.company.poetracker.entity.PoeCharacter;
import com.company.poetracker.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "poe-characters/:id", layout = MainView.class)
@ViewController(id = "PoeCharacter.detail")
@ViewDescriptor(path = "poe-character-detail-view.xml")
@EditedEntityContainer("poeCharacterDc")
public class PoeCharacterDetailView extends StandardDetailView<PoeCharacter> {
}
