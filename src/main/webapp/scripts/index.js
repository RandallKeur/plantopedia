'use strict';

import * as jQuery from '/scripts/jquery/dist/jquery.min.js';
import * as underscore from '/scripts/underscore/underscore-min.js';
import * as plantUrl from '/scripts/url.js';

const loadProfiles = function() {
    const profileTemplate = _.template('<div class="main__profile">' +
        '            <div class="main__profile-img-container">' +
        '                <div class="main__profile-item-characteristic-container">' +
        '                    <h2 class="main__profile-item-header"><%= commonName %></h2>' +
        '                    <div class="main__profile-characteristic-item">Genus Name: <%= genusName %></div>' +
        '                    <div class="main__profile-characteristic-item">Plant Type: <%= plantType %></div>' +
        '                </div>' +
        '            </div>' +
        '            <div class="main__profile-item-description"><%= description %></div>' +
        '        </div>');

    $.get(plantUrl.getBaseUrl() + 'api/profiles/').done(function (profiles) {
        const $profileListDiv = $('#profileListDiv');
        profiles.forEach(function (profile) {
            const $profile = $(profileTemplate({
                commonName: profile.commonName,
                genusName: profile.genusName,
                plantType: profile.plantType,
                description: profile.description
            }));
            $profileListDiv.append($profile);
        });
    });
};

$(document).ready(function() {
    loadProfiles();
});