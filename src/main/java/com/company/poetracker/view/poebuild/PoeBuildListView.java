package com.company.poetracker.view.poebuild;

import com.company.poetracker.entity.PoeBuild;

import com.company.poetracker.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "poe-builds", layout = MainView.class)
@ViewController(id = "PoeBuild.list")
@ViewDescriptor(path = "poe-build-list-view.xml")
@LookupComponent("poeBuildsDataGrid")
@DialogMode(width = "64em")
public class PoeBuildListView extends StandardListView<PoeBuild> {

}
