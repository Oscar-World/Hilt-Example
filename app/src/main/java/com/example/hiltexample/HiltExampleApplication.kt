package com.example.hiltexample

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/*
Hilt를 사용하기 위해서는 Application 클래스 포함이 강제된다.
@HiltAndroidApp 어노테이션으로 의존성 주입의 시작점이 지정된다고 볼 수 있다.

*Application Class : App 내 모든 컴포넌트에서 공유할 수 있는 전역 클래스이며
모든 컴포넌트 중 제일 먼저 인스턴스화 된다.
 */
@HiltAndroidApp
class HiltExampleApplication: Application()