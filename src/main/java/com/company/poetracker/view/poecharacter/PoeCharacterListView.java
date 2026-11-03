package com.company.poetracker.view.poecharacter;

import com.company.poetracker.entity.PoeCharacter;

import com.company.poetracker.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "poe-characters", layout = MainView.class)
@ViewController(id = "PoeCharacter.list")
@ViewDescriptor(path = "poe-character-list-view.xml")
@LookupComponent("poeCharactersDataGrid")
@DialogMode(width = "64em")
public class PoeCharacterListView extends StandardListView<PoeCharacter> {

}
