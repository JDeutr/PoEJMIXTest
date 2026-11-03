package com.company.poetracker.view.league;

import com.company.poetracker.entity.League;

import com.company.poetracker.view.main.MainView;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "leagues", layout = MainView.class)
@ViewController(id = "League.list")
@ViewDescriptor(path = "league-list-view.xml")
@LookupComponent("leaguesDataGrid")
@DialogMode(width = "64em")
public class LeagueListView extends StandardListView<League> {

}
