package com.company.poetracker.view.poebuild;

import com.company.poetracker.entity.PoeBuild;
import com.company.poetracker.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "poe-builds/:id", layout = MainView.class)
@ViewController(id = "PoeBuild.detail")
@ViewDescriptor(path = "poe-build-detail-view.xml")
@EditedEntityContainer("poeBuildDc")
public class PoeBuildDetailView extends StandardDetailView<PoeBuild> {
}
