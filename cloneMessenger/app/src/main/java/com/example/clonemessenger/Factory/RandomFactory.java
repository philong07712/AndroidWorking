package com.example.clonemessenger.Factory;

import com.example.clonemessenger.Model.Human;
import com.example.clonemessenger.Model.IHuman;
import com.example.clonemessenger.Model.News.INews;
import com.example.clonemessenger.Model.News.News;
import com.example.clonemessenger.R;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFactory implements IFactory
{
    Random generate = new Random();
    List<Integer> listAvatarImgs = new ArrayList<>(
            Arrays.asList(R.drawable.elena,
                    R.drawable.ethan,
                    R.drawable.mya,
                    R.drawable.rose,
                    R.drawable.han,
                    R.drawable.steve,
                    R.drawable.josh)
    );

    List<String> listName = new ArrayList<>(
            Arrays.asList("Mya",
                    "Ethan",
                    "Steve",
                    "Han",
                    "Elena",
                    "Rose",
                    "Josh")
    );

    List<Integer> listNewsImgs = new ArrayList<>(
            Arrays.asList(R.drawable.mermaid,
                    R.drawable.ninja,
                    R.drawable.spring,
                    R.drawable.rainbow,
                    R.drawable.water,
                    R.drawable.wink,
                    R.drawable.umbrella,
                    R.drawable.paint2,
                    R.drawable.paint,
                    R.drawable.illustrationtwo,
                    R.drawable.illustration,
                    R.drawable.houses,
                    R.drawable.cat,
                    R.drawable.bee,
                    R.drawable.blossom,
                    R.drawable.butterfly)
    );
    @Override
    public INews initNews() {
        int readState = generate.nextInt(3);
        return new News(randomNews(), readState);
    }

    @Override
    public IHuman initHuman() {
        return new Human(randomAvatar(), randomName());
    }

    private int randomAvatar()
    {
        int position = generate.nextInt(this.listAvatarImgs.size());
        return this.listAvatarImgs.get(position);
    }

    private int randomNews()
    {
        int position = generate.nextInt(this.listNewsImgs.size());
        return this.listNewsImgs.get(position);
    }

    private String randomName()
    {
        int position = generate.nextInt(this.listName.size());
        return this.listName.get(position);
    }
}
