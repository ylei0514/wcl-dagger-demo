package clwang.chunyu.me.wcl_dagger_demo;

import javax.inject.Singleton;

import dagger.Component;

/**
 * 组件
 * Created by wangchenlong on 16/1/2.
 */
@Singleton
@Component(modules = {MainModule.class})
public interface DemoComponent extends DemoGraph {
    final class Initializer {
        private Initializer() {
        } // No instances.

        // 初始化组件
        public static DemoComponent init(DemoApplication app) {
            return DaggerDemoComponent.builder()
                    .mainModule(new MainModule(app))
                    .build();
        }
    }
}