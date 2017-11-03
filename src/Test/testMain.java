package Test;

import java.util.List;

import org.apache.commons.lang3.StringEscapeUtils;


import kr.co.shineware.nlp.komoran.core.analyzer.Komoran;
import kr.co.shineware.util.common.model.Pair;
import kr.co.shineware.util.common.string.StringUtil;

public class testMain 
{
	public static void main(String[] args)
	{
		Komoran	komoran = new Komoran("G:\\WorkSpace\\PersonalProject\\models-light");
		
		//String str = StringEscapeUtils.unescapeJava("\ud50c\ud0d0\uc740 \uc9e7\uc9c0\ub9cc \uc81c\uac00 \uc9c0\uae08\uae4c\uc9c0 \ud574\ubcf8 \uac8c\uc784\ub4e4 \uc911\uc5d0 '\ub108\ubb34 \uc2e4\ub9dd\ud55c \uba40\ud2f0\ud50c\ub808\uc774 \uac8c\uc784'\uc774\uc5b4\uc11c \ud3c9\uac00\ub97c \uc77c\ucc0d \uc801\uc5b4\ub193\uc2b5\ub2c8\ub2e4.\n\n\uccab\ubc88\uca30\ub85c \ub108\ubb34\ud560 \uc815\ub3c4\uc758 \uac1c\uc801\ud654\uc778\ub370\uc694.\n\ubcf8\uc778 \ucef4\ud4e8\ud130\uac00 i7-4790k, 16\uae30\uac00 \ub7a8, r9 390\uc778\ub370 \ucd5c\ud558\uc635 60\ud504\ub808\uc784, \uc0c1\uc635 30~40\ud504\ub808\uc784 \ub098\uc640\uc90d\ub2c8\ub2e4.\n\uadf8\uc815\ub3c4\uba74 \uad1c\ucc2e\uc740\uac70 \uc544\ub2c8\uc57c? \ud558\uc2e4 \uc218 \uc788\uaca0\uc9c0\ub9cc \ubb38\uc81c\ub294 gta4\ubcf4\ub2e4\ub3c4 \uadf8\ub798\ud53d\uc774 \ud6e8\uc52c \uafb8\uc9c4\ub370 \uc694\uad6c\uc0ac\uc591\uc740 gta5\uc758 \uc2f8\ub2e4\uad6c\ub97c \ud6c4\ub9b4\uc815\ub3c4\ub2c8 \ubb38\uc81c\uc778\uac81\ub2c8\ub2e4.\n\n\ub450\ubc88\uca30\ub85c \uc774\ub7f0 \uc288\ud305 \uba40\ud2f0\uac8c\uc784\uc774 \ub298 \uadf8\ub807\ub4ef\uc774 \ud575\ubb38\uc81c\uc785\ub2c8\ub2e4. \ud2b9\ud788 \uc194\ud050\ub3cc\ub9ac\uba74 \uc9c0\uc625\ub3c4 \uadf8 \uc790\uccb4.\n\ud0ac\ucea0\ub3c4 \uc5c6\uc5b4\uc11c \ub0b4\uac00 \uadf8 \uc720\uc800\ud55c\ud14c \uc5b4\ub5bb\uac8c \uc8fd\uc5c8\ub294\uc9c0 \uc54c \ubc29\ubc95\uc774 \uc5c6\uae30\ub584\ubb38\uc5d0 \ud575\uc778\uc9c0 \uc544\ub2cc\uc9c0 \uc560\ub9e4\ubaa8\ud638\ud560\ub54c \ub108\ubb34 \ud798\ub4ed\ub2c8\ub2e4.\n\n\uc138\ubc88\uc9f8\ub85c \uc774 \uac8c\uc784\uc758 \uc7a5\ub974\uac00 \ud638\ubd88\ud638\ub97c \ud0d1\ub2c8\ub2e4.\nfps\ub97c \uc88b\uc544\ud55c\ub2e4\uace0 \uc774 \uac8c\uc784\ub3c4 \uc798 \ub9de\uaca0\uc9c0 \uc0dd\uac01\ud558\uc2dc\uba74 \uc548 \ub41c\ub2e4\uace0 \ubd05\ub2c8\ub2e4.\n\uc800\uac19\uc774 \uc0c1\ub300\ubc29\uc774 \uc5b4\ub514\uc5d0 \uc788\uc744\uc9c0 \ubbf8\ub9ac \uc608\uce21\uc744 \ud574\uc11c \ud478\uc2dc\uac00\ub294\uac78 \uc88b\uc544\ud558\uac70\ub098, \uc801\uc774 \uc62c\ubc95\ud55c \uc7a5\uc18c\uc5d0 \uc6b0\uc8fc\ubc29\uc5b4\ub97c \ud558\ub294 '\uc0c1\ub300\ubc29\uc744 \uc8fd\uc774\uac70\ub098 \uc9c0\uc5ed\uc744 \uc9c0\ud0a4\ub294\ub370 \ucd08\uc810\uc774 \ub9de\ucdb0\uc838\uc788\ub294 \ud50c\ub808\uc774'\ub97c \uc88b\uc544\ud558\ub294 \uc720\uc800\ub4e4\uc740 \uc774 \uac8c\uc784\uc774 \uc548\ub9de\ub294 \uac8c\uc784\uc77c\uac81\ub2c8\ub2e4. \uc815\ub9d0\ub85c\uc694.\n\uc774 \uac8c\uc784\uc740 \ud30c\ubc0d \uc6b4\ube68\uc774 \uc788\uc5b4\uc11c \ub0b4\uac00 \uc6d0\ud558\ub294 \uc7a5\ube44\ub97c \ub084 \ud655\ub960\uc774 \ub0ae\uace0, \n\uc548\uc804\uc9c0\ub300\uac00 \uac08\uc218\ub85d \uc881\uc544\uc9c0\uae30\uc5d0 \uc548\uc804\ud55c \uc7a5\uc18c\ub97c \ud3ec\uae30\ud558\uace0 \uc218\uc2dc\ub85c \uc6c0\uc9c1\uc5ec\uc57c \ub418\uba70 \n\uc5b4\ub514\uc11c \uc801\uc774 \ud280\uc5b4\ub098\uc62c\uc9c0\ub3c4 \ubaa8\ub974\uace0 \uc0dd\uc874\uc5d0 \uc911\uc810\uc744 \ub9de\ucdb0\uc57c \ud558\ub294 \uad00\uacc4\ub85c \ub9e4\uc6b0 \uc2e0\uc911\ud55c \ud50c\ub808\uc774\uac00 \uc694\uad6c\ub418\ub2c8\uae4c\uc694.\n\n\ub124\ubc88\uca30\ub85c \ucee8\ud150\uce20 \ubd80\uc871\uc785\ub2c8\ub2e4.\n\uce74\uc2a4 \uae00\uc635\uc740 \uacbd\uc7c1\ubaa8\ub4dc\uac00 \uc9c8\ub9ac\uba74 \uad70\ube44\uacbd\uc7c1\uc744 \ud558\ub358\uac00 \ucee4\ubba4\ub2c8\ud2f0 \uc11c\ubc84 \uac00\uc11c \uc880\ube44, \uc11c\ud504, \uac10\uc625, rpg, \uacf5\uc12d \uae30\ud0c0 \ub4f1\ub4f1\uc744 \ud558\ub294\ub4f1 \ud50c\ud0d0 500\uc2dc\uac04\uc744 \ub118\uaca8\ub3c4 \ud314\ub9cc\ud55c \uc694\uc18c\uac00 \ub0a8\uc544\uc788\uc5c8\ub358\uac83\uc5d0 \ubc18\ud574 \ubc30\uadf8\ub294 \ud314\ub9cc\ud55c \uc694\uc18c\uac00 \ub9e4\uc6b0 \uc81c\ud55c\uc801\uc774\ub77c \ud55c\ubc88 \uc9c8\ub9ac\uba74 \ubc11\ub3c4 \ub05d\ub3c4 \uc5c6\uc774 \uc9c8\ub9bd\ub2c8\ub2e4.\n\n\ub2e4\uc12f\ubc88\uc9f8\ub85c \uc2a4\ucffc\ub4dc\uc2dc \ub9c8\uc774\ud06c\uac00 \uac70\uc758 \ud544\uc218\ub77c \uc790\uc2e0\uc774 \uc778\uc2f8\ub77c\uc11c '\ubc30\uadf8\ud558\ub294 \ub098\uc640 \ucf54\ub4dc\uac00 \uc798 \ub9de\ub294 \uce5c\uad6c\ub4e4' \uc774 \ub9ce\ub2e4\uba74 \ub178\uae4c\ub9ac \uae4c\ub294 \uc7ac\ubbf8\ub77c\ub3c4 \uc788\uaca0\uc9c0\ub9cc \uc778\uc2f8 \uc544\ub2c8\uc2e0\ubd84\ub4e4\uc740 \uc0dd\ud310 \ubaa8\ub974\ub294 \ubd84\ub4e4\uc774\ub791 \uac19\uc774\ud574\uc57c\ub418\ub294\ub370 \uc2a4\ucffc\ub4dc \uafb8\ub9b4\ub584 \uc9c4\uc0c1\ub9cc\ub098\uba74 \uba58\ud0c8\ub9cc \ub098\uac11\ub2c8\ub2e4.\n\n\ub9c8\uc9c0\ub9c9\uc73c\ub85c \ud37c\ube14\ub9ac\uc154\uac00 \uce74\uce74\uc624\ub77c\ub294 \uc810.\n\uc815\uc561\uc81c\uac8c\uc784\uc5d0 \ud655\ub960\uc544\uc774\ud15c\uc744 \ub3c4\uc785\ud558\uace0, \ub3c8\uc744 \ubc8c \uc218\ub9cc \uc788\ub2e4\uba74 \ubc38\ub7f0\uc2a4\ub97c \ud30c\uad34\uc2dc\ud0a4\ub354\ub77c\ub3c4 \ud55c\ud0d5\uc744 \uce58\uaca0\ub2e4 \ub77c\ub294 \ub9c8\uc778\ub4dc\ub85c \ub618\ub618\ubb49\uce5c \uad6d\ub0b4\uac8c\uc784\uc5d0 \ud658\uba78\uc774 \ub4e4\uc5b4\uc11c \uc2a4\ud300\uc73c\ub85c \uac74\ub108\uc654\uac74\ub9cc \uc774 \uc545\ub9c8\ub4e4\uc5d0\uac8c \ud37c\ube14\ub9ac\uc154\ub97c \ub9e1\uae34 \uacb0\uacfc. 'pc\ubc29 \ubb34\ub8cc\ud654+pc\ubc29 \ud61c\ud0dd\uc81c\uacf5+\uc11c\ubc84\ud1b5\ud569'..\n\uc5ed\uc2dc \uc608\uc0c1\uc744 \ube57\ub098\uac00\uc9c0 \uc54a\ub294 \ud589\ubcf4\ub97c \ubcf4\uc5ec\uc8fc\uace0 \uc788\uc2b5\ub2c8\ub2e4. \uc18c\ub140\uc804\uc120\uc5d0\uac8c \ubc30\uc6b4\uac8c \ud558\ub098\ub3c4 \uc5c6\ub098\ubcf4\ub124\uc694.\n\n\ud55c\ub9c8\ub514\ub85c \uc694\uc57d\ud558\uc790\uba74 '\uc785\uc18c\ubb38\uc774 \ub108\ubb34 \uac70\ud558\uac8c \ud37c\uc9c4 \uac70\ud488\uac8c\uc784'\uc774\ub77c\uace0 \ubd05\ub2c8\ub2e4.\n\uc694\uc998\uc740 \uc720\uc800\ub4e4\uc774 \ube44\ucd94\ucc9c\uc744 \ub54c\ub824\ubc15\uc544\uc8fc\uace0 \uc788\uc9c0\ub9cc \uc81c\uac00 \uad6c\ub9e4\ud588\uc744 \ub54c\ub9cc\ud574\ub3c4 '\uc5ed\ub300\uae09 \uba85\uc791'\uc774\ub77c\ub294 \ud3c9\uac00\uac00 \ub9ce\uc544\uc11c \ucc98\uc74c \ud50c\ud0d0 30\ubd84\uc9f8\ubd80\ud130 \ub178\uc7bc \ub0c4\uc0c8\uac00 \ub098\ub3c4 \uacc4\uc18d \ud50c\ub808\uc774\ud574\ubcf4\uba74 \uc7ac\ubc0c\uc5b4 \uc9c8\uac70\ub77c\uace0 \uc0dd\uac01\ud588\uc9c0\ub9cc \uc2e4\ub9dd\ub9cc \ub354 \ub298\uc5b4\uac14\ub124\uc694");
		String temp = "플탐은 짧지만 제가 지금까지 해본 게임들 중에 '너무 실망한 멀티플레이 게임'이어서 평가를 일찍 적어놓습니다.";
		//System.out.println(str);
		String str="pc에서 깔끔하게 돌아가는 매력에 하는 게임.사람하고 하는건 비추천함.이기기위해 수단방법을 안가림.일부러 막 시작부터 멈칫멈칫 슬로우비디오 만드는 새끼들이 있음.그런 밉상짓거리하면 지때문에 사람들 게임 다 떠나게 되는걸 못느끼나봐...옷입은 꼬라진 무슨 정신병자처럼, 그덩치에 레슬러복에 핑크색 왜 집어넣는거여 또라이맞냐진짜...하여튼 굳이 사람하고 할거면 친구초대로 친구랑 하는걸 추천함.온라인대전하면 재수없으면 정신병자랑 맞선하는 꼴을 보게됨.";
		str = StringEscapeUtils.unescapeJava("\uc9c0\ub098\uce58\uac8c \uacfc\ub300\ud3c9\uac00\ub418\uc5c8\ub2e4\ub294 \ub290\ub08c\uc744 \ubc1b\uc740 \uac8c\uc784\n\n\uc88b\uc740 \ub0b4\ub7ec\ud2f0\ube0c\ub97c \uac00\uc9c0\uace0 \uc788\ub2e4\ub294 \uac83\uc740 \uc778\uc815\ud558\uc9c0\ub9cc, \uc774 \uc5ed\uc2dc \uadf8\ub2e4\uc9c0 \uc0c8\ub85c\uc6b4 \uac83\uc774\ub77c\uace0 \ubcf4\uae30\ub294 \uc5b4\ub835\ub2e4.\n20\ub144\uc804 \uc601\uc0c1\uc778 \uacf5\uac01\uae30\ub3d9\ub300\uc5d0\uc11c\ub3c4 \uc774\ubbf8 \ube44\uc2b7\ud55c \uc8fc\uc81c\ub97c \ub2e4\ub8e8\uace0 \uc788\uc73c\uba70, \uc57d\uac04\uc758 \ubcc0\uc8fc\uac00 \ub4e4\uc5b4\uac00 \uc788\ub2e4\uace0 \ubcf4\uba74 \ub41c\ub2e4. \uae30\ubcf8\uc801\uc778 \ud50c\ub808\uc774 \ud658\uacbd\uc740 \ubc14\uc774\uc624 \uc1fc\ud06c\ub97c \ub5a0\uc62c\ub9ac\uac8c \ud558\uace0, \ub9c8\uc9c0\ub9c9 \uc7a5\uba74\uc740 \ub77c\ub9c8\uc640\uc758 \uc778\ud130\ubdf0\uc758 \ud55c \uc7a5\uba74\uc744 \ubcf4\ub294 \ub4ef\ud55c \ubd84\uc704\uae30\uc774\uace0...\n\uc5ec\uae30\uc800\uae30\uc11c \uac00\uc838\uc628 \uc544\uc774\ub514\uc5b4\uac00 \uc870\ud569\ub41c \uc774\uc57c\uae30\ub77c\ub294 \uc778\uc0c1\uc744 \ubc1b\uc558\ub2e4.\n\n\ubb34\uc5c7\ubcf4\ub2e4 \ud070 \ubb38\uc81c\uc810\uc740, \uc774\ub7ec\ud55c \uc2a4\ud1a0\ub9ac\ub97c \ubcf4\uae30 \uc704\ud574\uc11c \uc9c4\ud589\ud574\uc57c \ud558\ub294 \ub098\uba38\uc9c0 90%\uc758 \uac8c\uc784\ud50c\ub808\uc774\uac00 \uac00\uc9c0\ub294 \uacb0\ud568\uc774 \ub108\ubb34 \ud06c\ub2e4\ub294 \uc810\uc774\ub2e4. \ud55c\ub9c8\ub514\ub85c \ub9d0\ud558\uc790\uba74, [b]\uac8c\uc784 \uc9c4\ud589\uc774 \ub108\ubb34\ub098 \ubd80\uc870\ub9ac\ud558\ub2e4.\n\n\ud574\uc678 \uc720\uc800\ub4e4 \ud3c9\uc744 \ubcf4\uba74 walking simulator\ub77c\ub294 \ub9d0\uc774 \uc885\uc885 \ub098\uc624\ub294\ub370, \uc9c1\uc811 \ud50c\ub808\uc774\ud574\ubcf4\uba74 \uc801\ud655\ud55c \ud45c\ud604\uc784\uc744 \uc2e4\uac10\ud560 \uc218 \uc788\ub2e4. \ub300\ubd80\ubd84\uc758 \ud50c\ub808\uc774\uac00 \ub2e8\uc9c0 \ub9f5\uc0c1\uc758 \ubaa9\ud45c\uc9c0\uc810\uc744 \ucc3e\uc544\uac00\ub294 \uac83\uc774 \uc804\ubd80\uc778\ub370, \uc4f8\ub370\uc5c6\uc774 \ud5e4\ub9e4\ub3c4\ub85d \ub9cc\ub4e4\uc5b4 \ub193\uc740 \ubd80\ubd84\uc774 \ub9ce\ub2e4. \uac8c\uc784 \ud2b9\uc131\uc0c1 \uc9c0\ub3c4\uc870\ucc28 \uc874\uc7ac\ud558\uc9c0 \uc54a\uc74c\uc5d0\ub3c4 \ubd88\uad6c\ud558\uace0 \ub2f5\ub2f5\ud55c \uc2dc\uc57c\ub85c \uac00\ub824\uc9c4 \uc2ec\ud574\uc5d0\uc11c\uae4c\uc9c0 \uae38\uc744 \ucc3e\uc544\ub2e4\ub2c8\uac8c \ub9cc\ub4dc\ub294 \uc810\uc740 \ub0a9\ub4dd\uc774 \ub418\uc9c0 \uc54a\ub294 \ubd80\ubd84\uc774\uc5c8\ub2e4. \n\n\uae38\ucc3e\uae30\uac00 \uc544\uc8fc \uc5b4\ub835\uac70\ub098 \ud55c \uac83\uc740 \uc544\ub2c8\uc9c0\ub9cc, \ub3cc\uc544\ub2e4\ub2c8\uba74\uc11c \uacbd\ud5d8\ud560 \uc218 \uc788\ub294 \uac83\uc774 \ubcc4\ub85c \uc5c6\uae30 \ub54c\ubb38\uc5d0 \ud544\uc694 \uc774\uc0c1\uc73c\ub85c \ub3d9\uc120\uc744 \uae38\uac8c \ub9cc\ub4e4\uc5b4 \ub193\uc558\ub2e4\ub294 \ub290\ub08c\uc744 \uc9c0\uc6b8 \uc218\uac00 \uc5c6\ub2e4. \uc720\uc77c\ud55c \uc561\uc158\ud30c\ud2b8\uc778 \uc801\uacfc\uc758 \uc870\uc6b0\ub3c4 \ubcbd\ub4a4\uc5d0 \uc228\uac70\ub098 \ub6f0\uc9c0 \uc54a\ub294 \uac83, \uc774 \ub450\uac00\uc9c0 \ub2e8\uc21c\ud55c \ud589\ub3d9\uc73c\ub85c \uac70\uc758 \ubaa8\ub4e0 \ubd80\ubd84\uc744 \ucee4\ubc84\ud560 \uc218 \uc788\uc5b4 \uae34\uc7a5\uac10\uc744 \ub192\uc774\ub294\ub370 \ub9ce\uc740 \ub3c4\uc6c0\uc774 \ub418\uc9c0 \uc54a\uace0, \uac8c\uc784\uc758 \uac00\uc7a5 \ud070 \uc7a5\uc810\uc774\ub77c \ud560 \uc2a4\ud1a0\ub9ac\ub294 \uc8fc\uc694 \ub0b4\uc6a9\uc774 \ub300\ubd80\ubd84 \ud6c4\ubc18\uc5d0 \uc9d1\uc911\ub418\uc5b4 \uc788\ub2e4.\n\n\uc774\ub7ec\ud55c \uacb0\uc810\ub4e4\uc740 \uacb0\uacfc\uc801\uc73c\ub85c \ucd08\uc911\ubc18 \uac8c\uc784 \uc9c4\ud589\uc758 \ub3d9\ub825\uc744 \uc2ec\uac01\ud558\uac8c \ub5a8\uc5b4\ub728\ub9b0\ub2e4. \uac8c\uc784 \ud50c\ub808\uc774\ub294 \uae30\ubcf8\uc801\uc73c\ub85c \ubc14\uc774\uc624 \ud558\uc790\ub4dc\uc2dd \uae38\ucc3e\uae30\uc5d0 \uae30\ubc18\ud558\uace0 \uc788\ub294\ub370, \ud50c\ub808\uc774\uc5b4\uac00 \uc774\ub97c \uc9c4\ud589\ud558\ub3c4\ub85d \ub9cc\ub4dc\ub294 \uc694\uc18c-\uc561\uc158\uc774\ub098 \uc774\ubca4\ud2b8 \ud750\ub984-\ub4e4\uc774 \uc720\uae30\uc801\uc73c\ub85c \uc798 \uc5f0\uacb0\ub418\uc5b4 \ubabb\ud558\ub2e4\ubcf4\ub2c8 \uacb0\ub9d0\uc5d0 \uc774\ub974\uae30\uae4c\uc9c0\uc758 \uacfc\uc815\uc774 \uc5c4\uccad\ub098\uac8c \uc9c0\ub8e8\ud558\ub2e4. \uac8c\uc784\uc774\ub77c\ub294 \ub9e4\uccb4\uc5d0\uc11c \uc2a4\ud1a0\ub9ac \ubc18\uc804\uc744 \uc704\ud574 \uc774\ud1a0\ub85d \uc9c0\ub8e8\ud55c \ud50c\ub808\uc774\ub97c \uac15\uc694\ud558\ub294 \uac83\uc774 \uc633\uc740 \ubc29\ubc95\uc77c\uae4c? \uac1c\uc778\uc801\uc73c\ub85c\ub294 \ub3d9\uc758\ud558\uae30 \uc5b4\ub824\uc6b4 \ubc29\uc2dd\uc774\uc5c8\ub2e4.\n\n\uc6d0\ub798 \ubd80\uc815\uc801\uc778 \ub9ac\ubdf0\ub294 \uc798 \uc4f0\uc9c0 \uc54a\uc9c0\ub9cc, \uac70\uc758 \ubaa8\ub4e0 \ub9ac\ubdf0\uac00 \ucc2c\uc591\uc77c\uc0c9\uc774\uace0 \ud3c9\uc774 \uc555\ub3c4\uc801\uc73c\ub85c \uae0d\uc815\uc801\uc774\uc5c8\uae30 \ub54c\ubb38\uc5d0 \uad73\uc774 \ub9ac\ubdf0\ub97c \uc791\uc131\ud558\uc600\ub2e4.\n\ub098\uc640 \uac19\uc740 \ucde8\ud5a5\ub3c4 \ubd84\uba85 \uc788\uc744 \uac83\uc774\uace0, \uadf8\ub7f0 \ubd84\uc5d0\uac8c \uc774 \uac8c\uc784\uc740 \uc804\ud600 \ub9de\uc9c0 \uc54a\uc744 \uac83\uc774\ubbc0\ub85c.\n\n\ub2f5\ub2f5\ud55c \uac83\uc744 \uc2eb\uc5b4\ud558\ub294 \uc0ac\ub78c, \uac15\ub82c\ud55c \uc561\uc158\uc774\ub098 \ud638\ub7ec\ub97c \uc6d0\ud558\ub294 \uc0ac\ub78c\uc5d0\uac8c\ub294 \ucd94\ucc9c\ud558\uc9c0 \uc54a\ub294\ub2e4.\n\ud2b9\ud788\ub098 \uae38\ucc3e\uae30 \uac8c\uc784\uc5d0 \ud610\uc624\uac10\uc744 \ub290\ub07c\ub294 \ubd84\uc774\ub77c\uba74 \uc774 \uac8c\uc784\uc740 \uc808\ub300 \ud53c\ud558\ub77c\uace0 \ub9d0\ud558\uace0 \uc2f6\ub2e4.\n\uc704\uc5d0 \ud574\ub2f9\ud558\uc9c0\ub9cc \uc2a4\ud1a0\ub9ac\uac00 \uc815 \uad81\uae08\ud55c \ubd84\uc774\ub77c\uba74, \uc720\ud29c\ube0c \uc601\uc0c1\uc73c\ub85c \uac8c\uc784\uc744 \ub300\uccb4\ud558\ub294 \uac83\ub3c4 \uc88b\uc740 \ubc29\ubc95\uc774\ub77c \uc0dd\uac01\ud55c\ub2e4.");
		@SuppressWarnings("unchecked")
		List<List<Pair<String,String>>>	result
			=	komoran.analyze(str);
		/*for (List<Pair<String, String>> eojeolResult : result) 
		{
			for (Pair<String, String> wordMorph : eojeolResult) {
				System.out.println(wordMorph);
			}
		}*/
		for (List<Pair<String, String>> eojeolResult : result) 
		{
			for (Pair<String, String> wordMorph : eojeolResult) {
				if(		wordMorph.getSecond().equals("NNG")
					||	wordMorph.getSecond().equals("NNP"))
				System.out.println(wordMorph);
			}
		}
	}
}
